package week8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

    public void readFileWithBufferedReader(String filePath) {
        try {
            // get file
            File file = new File(filePath);

            // create a fileReader to read file
            FileReader fileReader = new FileReader(file);

            // create a bufferedReader to cache lines which read by fileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // read first line
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                // if previous line is not null then read next line
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileWithScanner(String filePath) {
        try {
            // create a StringBuilder and collect file lines into StringBuilder
            StringBuilder sb = new StringBuilder();

            // get file
            File file = new File(filePath);

            // give file to scanner as an input
            Scanner fileScanner = new Scanner(file);

            // loop until file has new line
            while (fileScanner.hasNextLine()) {
                sb.append(fileScanner.nextLine());
                sb.append("\n");
            }

            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // create our class instance
        FileReading fileReading = new FileReading();

        // give path to a string variable
        String filePath = "/Users/gokhanpolat/Developer/tallinn3/FirstFile.txt";

        // call buffered reading method
        fileReading.readFileWithBufferedReader(filePath);

        // call scanner reading method
        fileReading.readFileWithScanner(filePath);
    }
}
