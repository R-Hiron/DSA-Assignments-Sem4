package src.Assignment_3_Movie_Theater;

import java.util.Scanner;

public class MovieTheaterTest {
    public static void main(String[] args) {

        MovieTheater theater = new MovieTheater(5, 5);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Movie Theater Reservation System ===");
            System.out.println("1. Display Seating Chart");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();

            int row, col;

            switch (choice) {
                case 1:
                    theater.displaySeatingChart();
                    break;
                case 2:
                    System.out.print("Enter row number to reserve: ");
                    row = scanner.nextInt();
                    System.out.print("Enter column number to reserve: ");
                    col = scanner.nextInt();
                    theater.reserveSeat(row, col);
                    break;
                case 3:
                    System.out.print("Enter row number to cancel: ");
                    row = scanner.nextInt();
                    System.out.print("Enter column number to cancel: ");
                    col = scanner.nextInt();
                    theater.cancelSeat(row, col);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the reservation system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}
