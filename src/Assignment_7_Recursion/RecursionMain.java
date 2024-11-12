package src.Assignment_7_Recursion;

public class RecursionMain {

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "";
        }
        return decimalToBinary(decimal / 2) + (decimal % 2);
    }
}
