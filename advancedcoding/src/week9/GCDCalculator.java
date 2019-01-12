package week9;

public class GCDCalculator {

    public static void main(String[] args) {
        GCDCalculator gcdCalculator = new GCDCalculator();
        int[] arr = {60, 18, 45, 15};

        int resultGCD = gcdCalculator.findGCD(arr);

        System.out.println(resultGCD);
    }

    private int findGCD(int[] arr) {
        int gcd = 1;

        for (int i = 2; i <= arr[0]; i++) {
            boolean isCommon = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i == 0) {
                    isCommon = true;
                } else {
                    isCommon = false;
                    break;
                }
            }

            if (isCommon == true) {
                gcd = i;
            }
        }

        return gcd;
    }
}
