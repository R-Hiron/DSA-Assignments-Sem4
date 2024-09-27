package src.Assignment_3_Movie_Theater;

public class MovieTheater {
    private char[][] seats;
    private int rows;
    private int cols;

    public MovieTheater(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        seats = new char[rows][cols];
        initializeSeatingChart();
    }
    // Creating Seating chart with all seats available ('a')
    private void initializeSeatingChart() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'A'; 
            }
        }
    }

    // Reserving Seats
    public boolean reserveSeat(int row, int col) {
        if (isValidSeat(row, col)) {
            if (seats[row][col] == 'A') {
                seats[row][col] = '#'; // '#' for reserved Seats
                System.out.println("Seat (" + row + ", " + col + ") has been reserved.");
                return true;
            } else {
                System.out.println("Seat (" + row + ", " + col + ") is already reserved.");
                return false;
            }
        } else {
            System.out.println("Invalid seat position.");
            return false;
        }
    }

    // Canceling your Seat
    public boolean cancelSeat(int row, int col) {
        if (isValidSeat(row, col)) {
            if (seats[row][col] == '#') {
                seats[row][col] = 'A';
                System.out.println("Reservation for seat (" + row + ", " + col + ") has been canceled.");
                return true;
            } else {
                System.out.println("Seat (" + row + ", " + col + ") is not reserved.");
                return false;
            }
        } else {
            System.out.println("Invalid seat position.");
            return false;
        }
    }

    // displaying the current chart
    public void displaySeatingChart() {
        System.out.println("Current Seating Chart:");
        System.out.print("   ");
        for (int j = 0; j < cols; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Making sure a seat is available
    private boolean isValidSeat(int row, int col) {
        return (row >= 0 && row < rows && col >= 0 && col < cols);
    }
}
