package week9;

import java.io.*;

public class DigitFinderFromFile {

    private StringBuilder readFile() {
        StringBuilder sb = new StringBuilder();
        try {
            File file = new File("/Users/gokhanpolat/Developer/tallinn3/plain text.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = bufferedReader.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return sb;
    }

    private StringBuilder findNumbersOneByOne(String contentOfFile) {
        StringBuilder numbersContainer = new StringBuilder();
        for (int i = 0; i < contentOfFile.length(); i++) {
            String temp = "" + contentOfFile.charAt(i);

            if (temp.matches(".*\\d+.*")) {
                numbersContainer.append(temp + " , ");
            }
        }

        return numbersContainer;
    }

    private StringBuilder findOriginalNumbers(String contentOfFile) {
        StringBuilder numbersContainer = new StringBuilder();
        for (int i = 0; i < contentOfFile.length(); i++) {
            String temp = "" + contentOfFile.charAt(i);

            if (temp.matches(".*\\d+.*") || temp.equals("-")) {
                numbersContainer.append(temp);
                i++;
                temp = "" + contentOfFile.charAt(i);
                while(temp.matches(".*\\d+.*") || temp.equals("/")){
                    numbersContainer.append(temp);
                    i++;
                    temp = "" + contentOfFile.charAt(i);
                }

                numbersContainer.append(" ---- ");
            }
        }

        return numbersContainer;
    }

    private void writeResultToFile(String result, String writingFileUrl){
        try {
            File file = new File(writingFileUrl);
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(result);

            printWriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DigitFinderFromFile digitFinderFromFile = new DigitFinderFromFile();

        StringBuilder fileContent = digitFinderFromFile.readFile(); // first step

        StringBuilder numbers = digitFinderFromFile.findNumbersOneByOne(fileContent.toString()); // second step

        String writingFileUrl = "/Users/gokhanpolat/Developer/tallinn3/numbers-result.txt";
        digitFinderFromFile.writeResultToFile(numbers.toString(), writingFileUrl); // third step

        StringBuilder numbers2 = digitFinderFromFile.findOriginalNumbers(fileContent.toString()); // second step
        String writingFileUrl2 = "/Users/gokhanpolat/Developer/tallinn3/numbers-result2.txt";
        digitFinderFromFile.writeResultToFile(numbers2.toString(), writingFileUrl2); // third step
    }
}
