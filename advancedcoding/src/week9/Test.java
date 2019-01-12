package week9;

import java.util.Scanner;

public class Test {

//    public static void main(String[] args) {
//        String var = "javaworld";
//
//        boolean isContainsNumber = var.matches(".*\\d+.*");
//
//        System.out.println(isContainsNumber);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(n%2==1){
            System.out.println("Weird");
        } else if(n>=2 && n<=5){
            System.out.println("Not Weird");
        } else if(n>=6 && n<=20){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
