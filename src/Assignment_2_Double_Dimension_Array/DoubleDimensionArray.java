package src.Assignment_2_Double_Dimension_Array;

public class DoubleDimensionArray {
    private int[][] arr;

    public DoubleDimensionArray(int rows, int cols) {
        arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted " + value + " at (" + row + ", " + col + ")");
            } else {
                System.out.println("Cell (" + row + ", " + col + ") is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index (" + row + ", " + col + ")");
        }
    }

    public void traverse() {
        System.out.println("Array elements:");
        for (int[] row : arr) {
            for (int val : row) {
                if (val == Integer.MIN_VALUE) {
                    System.out.print(" - ");
                } else {
                    System.out.print(val + " ");
                }
            }
            System.out.println();
        }
    }

    public void search(int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == value) {
                    System.out.println("Found " + value + " at (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println(value + " not found in the array");
    }

    public void delete(int row, int col) {
        try {
            if (arr[row][col] != Integer.MIN_VALUE) {
                System.out.println("Deleting value " + arr[row][col] + " from (" + row + ", " + col + ")");
                arr[row][col] = Integer.MIN_VALUE;
            } else {
                System.out.println("Cell (" + row + ", " + col + ") is already empty");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index (" + row + ", " + col + ")");
        }
    }
}
