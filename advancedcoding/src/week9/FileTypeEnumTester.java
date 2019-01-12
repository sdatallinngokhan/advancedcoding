package week9;

import java.io.File;
import java.io.FilenameFilter;

public class FileTypeEnumTester {

    public static void main(String[] args) {
        try {
            File file = new File("/Users/gokhanpolat/Developer/tallinn3/");

            String[] fileList = file.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(FileTypeSimple.txt.name());
//                    return name.endsWith(FileTypeAdvanced.TXT.getValue());
                }
            });

            for (String s : fileList) {
                System.out.println(s);
            }
        } catch (Exception e) {

        }
    }
}
