package src.Assignment_1_150924;
import java.util.Scanner;
public class AverageTemperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gathering input for the number of days the user wants to track temp
        System.out.print("Enter the number of days you want to track temperatures for: ");
        int numberOfDays = scanner.nextInt();
        double[] temperatures = new double[numberOfDays];

        // Gathering inputs for the temp for each tracking day and appending to array
        System.out.println("Enter the temperatures for " + numberOfDays + " days:");
        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Calculating the average tempature
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        double average = sum / numberOfDays;

        // Finding all instances of days with above average temps
        int countAboveAverage = 0;
        for (double temp : temperatures) {
            if (temp > average) {
                countAboveAverage++;
            }
        }

        // Results
        System.out.printf("The average temperature is %.2f degrees.\n", average);
        System.out.println("Number of days with temperature above average: " + countAboveAverage);
    }
}
