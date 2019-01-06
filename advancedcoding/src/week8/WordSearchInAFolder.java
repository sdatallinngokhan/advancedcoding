package week8;

import java.io.*;

public class WordSearchInAFolder {

    public void searchWord() {
        try {
            File file = new File("/Users/gokhanpolat/Developer/tallinn3");

            File txtFiles[] = file.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.endsWith("txt");
                }
            });

            for (File f : txtFiles) {
                FileReader fileReader = new FileReader(f);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = bufferedReader.readLine();

                while (line != null) {
                    if (line.contains("Tallinn")) {
                        System.out.println(f.getName());
                        break;
                    }
                    line = bufferedReader.readLine();
                }
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WordSearchInAFolder wordSearchInAFolder = new WordSearchInAFolder();
        wordSearchInAFolder.searchWord();
    }
}
