package week8;

import java.io.*;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeatherAverageCalculator {

    public List<WeatherPOJO> readFileAndGetWeatherPOJOList(String readFilePath) {
        List<WeatherPOJO> weatherPOJOList = new LinkedList<>();
        try {
            File file = new File(readFilePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            int lineCounter = 1;
            while (line != null) {
                if (lineCounter % 6 == 0) {
                    line = bufferedReader.readLine();
                    lineCounter++;
                    continue;
                }

                WeatherPOJO weatherPOJO = new WeatherPOJO();

                weatherPOJO = getWeatherPOJO(line);
                weatherPOJOList.add(weatherPOJO);

                line = bufferedReader.readLine();
                lineCounter++;
            }
        } catch (IOException e) {
            e.printStackTrace(); // write exception to console with red letters
            System.out.println(e); // write exception to console with black letters
        }

        return weatherPOJOList;
    }

    public WeatherPOJO getWeatherPOJO(String line) {
        WeatherPOJO weatherPOJO = new WeatherPOJO();

        String[] splittedLine = splitLine(line);

        weatherPOJO.setDate(splittedLine[0]);
        weatherPOJO.setCity(splittedLine[1]);
        weatherPOJO.setWeather(Double.parseDouble(splittedLine[2]));

        return weatherPOJO;
    }

    public String[] splitLine(String line) {
        String[] splittedLine = line.split("\\s+");

        if (splittedLine.length > 3) {
            String[] splittedAndEditedLine = new String[3];

            splittedAndEditedLine[0] = splittedLine[0];

            String cityName = "";
            for (int i = 1; i < splittedLine.length - 1; i++) {
                cityName += splittedLine[i] + " ";
            }
            splittedAndEditedLine[1] = cityName;

            splittedAndEditedLine[2] = splittedLine[splittedLine.length - 1];

            return splittedAndEditedLine;
        }

        return splittedLine;
    }

    public Map<String, Double> getCityAndWeatherMap(List<WeatherPOJO> weatherPOJOList) {

        Map<String, Double> cityAndWeatherMap = new LinkedHashMap<>();

        // Same for loop as stream
//        for (WeatherPOJO weatherPOJO : weatherPOJOList) {
//            if (cityAndWeatherMap.get(weatherPOJO.getCity()) != null) {
//                cityAndWeatherMap.put(weatherPOJO.getCity(), cityAndWeatherMap.get(weatherPOJO.getCity()) + weatherPOJO.getWeather());
//            } else {
//                cityAndWeatherMap.put(weatherPOJO.getCity(), weatherPOJO.getWeather());
//            }
//        }
        weatherPOJOList.stream().forEach(weatherPOJO -> {
            if (cityAndWeatherMap.get(weatherPOJO.getCity()) != null) {
                cityAndWeatherMap.put(weatherPOJO.getCity(), cityAndWeatherMap.get(weatherPOJO.getCity()) + weatherPOJO.getWeather());
            } else {
                cityAndWeatherMap.put(weatherPOJO.getCity(), weatherPOJO.getWeather());
            }
        });

        return cityAndWeatherMap;
    }

    public void calculateAveragesAndWriteFile(Map<String, Double> cityAndWeatherMap, String writeFilePath) {
        DecimalFormat df = new DecimalFormat(".##");
        try {
            File file = new File(writeFilePath);
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("The average tempreatures between 01-07 January 2019");

            for (String city : cityAndWeatherMap.keySet()) {
                String line = city + " " + df.format(cityAndWeatherMap.get(city) / 7);
                printWriter.println(line);
            }

            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WeatherAverageCalculator weatherAverageCalculator = new WeatherAverageCalculator();

        String readFilePath = "/Users/gokhanpolat/Developer/tallinn3/01-07--2019.txt";
        List<WeatherPOJO> weatherPOJOList = weatherAverageCalculator.readFileAndGetWeatherPOJOList(readFilePath);
        Map<String, Double> cityAndWeatherMap = weatherAverageCalculator.getCityAndWeatherMap(weatherPOJOList);

        String writeFilePath = "/Users/gokhanpolat/Developer/tallinn3/01-07--2019-average.txt";
        weatherAverageCalculator.calculateAveragesAndWriteFile(cityAndWeatherMap, writeFilePath);
    }
}
