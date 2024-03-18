package RecursiveMultiplication;

import java.util.Scanner; // Import Scanner class

/**
 * This program prompts the user to enter five numbers, stores them in an array, and then 
 * calculates their product using a recursive method called multiply. The multiply method 
 * multiplies the current element with the product of the rest of the elements in the array 
 * until it reaches the last element.
 */
public class RecursiveMultiplication { 

    // Main method
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); // Create Scanner to gather input

        double[] numbers = new double[5]; // Global array for numbers

        System.out.println("Enter five numbers:"); // Prompt user

        for (int i = 0; i < 5; i++) { // Loop for numbers

            System.out.print("Number " + (i + 1) + ": "); // Prompt for number

            numbers[i] = scanner.nextDouble(); // Read number and add to array
        } // End For

        double product = multiply(numbers, 0); // Calculate product

        System.out.println("Product: " + product); // Display product

        scanner.close(); // Close Scanner
    } // End Main

    // Recursive method for product
    public static double multiply(double[] numbers, int index) {

        if (index == numbers.length - 1) { // Base case

            return numbers[index]; // Return last element

        } // End If
        else { // Recursive case

            return numbers[index] * multiply(numbers, index + 1); // Multiply recursively
        } // End else
    } // End Multiply
}// End RecursiveMultiplication
