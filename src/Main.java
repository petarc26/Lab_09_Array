import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Step 1: Declare an array of 100 integers
        int[] dataPoints = new int[100];

        // Step 2: Fill the array with random values 1-100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Step 3: Display the array values
        System.out.println("The values in dataPoints are:");

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println();

        // Step 4: Calculate sum and average
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + average);

        // Step 5: Ask user for a number
        int searchValue = SafeInput.getRangedInt(
                in, "Enter a number to search for", 1, 100);

        // Step 6: Count occurrences
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                count++;
            }
        }

        System.out.println("The value " + searchValue +
                " was found " + count + " times in the array.");

        // Step 7: Find the first occurrence
        int findValue = SafeInput.getRangedInt(
                in, "Enter another number to find", 1, 100);

        int position = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == findValue) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("The value " + findValue +
                    " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + findValue +
                    " was not found in the array.");
        }

        // Step 8: Find minimum and maximum
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }

            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);

        // Step 9: Test the getAverage method
        double[] doubleDataPoints = new double[dataPoints.length];

        for (int i = 0; i < dataPoints.length; i++) {
            doubleDataPoints[i] = dataPoints[i];
        }

        System.out.println("Average of dataPoints using getAverage is: "
                + getAverage(doubleDataPoints));
    }

    // Step 9: Static method to calculate average
    public static double getAverage(double values[]) {
        double total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total / values.length;
    }
}
