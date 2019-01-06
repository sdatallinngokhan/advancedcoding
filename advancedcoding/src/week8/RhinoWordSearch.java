package week8;

import java.io.*;

public class RhinoWordSearch {

    public void readFileAndWriteResult() {
        try {
            File file = new File("/Users/gokhanpolat/Developer/tallinn3/rhino.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            StringBuilder result = new StringBuilder();
            int lineNumber = 1;
            while (line != null) {
                if (line.toLowerCase().contains("rhino")) {
                    result.append(lineNumber + ". line contains rhino word");
                    result.append("\n");
                }
                line = bufferedReader.readLine();
                lineNumber++;
            }

            writeFile(result.toString());
        } catch (IOException e) {

        }
    }

    public void writeFile(String result) {
        try {
            File file = new File("/Users/gokhanpolat/Developer/tallinn3/rhino-result.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(result);

            printWriter.close();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {
        RhinoWordSearch rhinoWordSearch = new RhinoWordSearch();
        rhinoWordSearch.readFileAndWriteResult();
    }
}
