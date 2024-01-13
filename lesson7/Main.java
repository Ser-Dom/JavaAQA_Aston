package lesson7;

public class Main {

    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArray(validArray);
            System.out.println("Sum of array elements: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        String[][] invalidSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        try {
            int result = sumArray(invalidSizeArray);
            System.out.println("Sum of array elements: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "abc"}
        };

        try {
            int result = sumArray(invalidDataArray);
            System.out.println("Sum of array elements: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int rows = array.length;
        int columns = array[0].length;

        if (rows != 4 || columns != 4) {
            throw new MyArraySizeException("Array size is not 4x4");
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Invalid data in cell (" + i + "," + j + ")");
                }
            }
        }

        return sum;
    }
}
