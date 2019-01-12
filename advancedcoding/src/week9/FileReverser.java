package week9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReverser {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            File file = new File("/Users/gokhanpolat/Developer/tallinn3/reverse.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {

        }

        System.out.println(stringBuilder.reverse());
    }
}
