package week9;

import java.io.File;

public class MoreFileOperations {

    public static void main(String[] args) {

        try {
            File file = new File("/Users/gokhanpolat/Developer/tallinn3/");

            long fileSizeInByte = file.length();
            System.out.println("Size of file : " + fileSizeInByte + " byte");

            String fileName = file.getName();
            System.out.println("File name : " + fileName);

            boolean isDirectory = file.isDirectory();
            boolean isFile = file.isFile();
            System.out.println("Is directory? : " + isDirectory);
            System.out.println("Is file? : " + isFile);

            String parentOfFile = file.getParent();
            System.out.println("Parent is : " + parentOfFile);

            String absoluthPath = file.getAbsolutePath();
            System.out.println("Absoluth path : " + absoluthPath);

            long freeSpace = file.getFreeSpace();
            System.out.println("Free space : " + freeSpace / (1024 * 1024 * 1024) + " GB");

            File[] files = file.listFiles();
            for (File f : files){
                System.out.println(f.getName());
            }

        } catch (Exception ioe) {

        }

    }
}
