package week8;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWriting {

    public void writeFile(String filePath) {
        try {
            // go and find file or create file if it is not exist (not creating directory, only file)
            File file = new File(filePath);

            // Create a FileWriter to append already existing file
            FileWriter fileWriter = new FileWriter(file, true);

            // bind created file to writer
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // write something into file
            printWriter.println("First sentence is not correct because today is Saturday");

            // save and close the file
            printWriter.close();
        } catch (Exception e) {
            System.out.println("File path does not exist. Exception is " + e);
        }
    }

    public static void main(String[] args) {

        FileWriting fileWriting = new FileWriting();

        String filePath = "/Users/gokhanpolat/Developer/tallinn3/FirstFile.txt";
        fileWriting.writeFile(filePath);

        String filePath2 = "/Users/gokhanpolat/Developer/SecondFile.txt";
        fileWriting.writeFile(filePath2);
    }
}
