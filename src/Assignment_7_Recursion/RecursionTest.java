package src.Assignment_7_Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        System.out.println("""
        ============================================
                       Recursion Test
        ============================================""");
        int[] DigitSumTestNums = {112, 10, 12, 110, 1234};
        int[] expectedSums = {4, 1, 3, 2, 10};

        for (int i = 0; i < DigitSumTestNums.length; i++) {
            int number = DigitSumTestNums[i];
            int result = RecursionMain.sumOfDigits(number);
            System.out.println("Sum of digits of " + number + " is: " + result + " | Expected: " + expectedSums[i]);
        }
        System.out.println("============================================\n");
        System.out.println("""
        ============================================
                   Decimal to Binary Test
        ============================================""");
        int[] decimalTestNums = {12, 5, 7, 10, 0};
        String[] expectedBinaries = {"1100", "101", "111", "1010", "0"};
        for (int i = 0; i < decimalTestNums.length; i++) {
            int decimalNumber = decimalTestNums[i];
            String binaryRepresentation = RecursionMain.decimalToBinary(decimalNumber);

            if (binaryRepresentation.equals("")) {
                binaryRepresentation = "0";
            }

            System.out.println("Binary for " + decimalNumber + " is: " + binaryRepresentation + " | Expected: " + expectedBinaries[i]);
        }
        System.out.println("============================================");
    }
}

