/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2bq5;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Task2bQ5 {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);

        boolean continueProgram = true;

        while (continueProgram) {
            int evenCount = 0;
            int oddCount = 0;

            System.out.println("Enter a sequence of integers (type 'end' to stop):");

            while (true) {
                String input = out.nextLine();

                // Check if the input is 'end'
                if (input.length() == 3 && input.charAt(0) == 'e' && input.charAt(1) == 'n' && input.charAt(2) == 'd') {
                    break;
                }

                // Check if the input is a valid integer
                boolean validInteger = true;
                int number = 0;

                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (c < '0' || c > '9') {
                        validInteger = false;
                        break;
                    }
                }

                if (validInteger) {
                    // Convert string to integer
                    number = 0;
                    for (int i = 0; i < input.length(); i++) {
                        number = number * 10 + (input.charAt(i) - '0');
                    }

                    // Count even or odd
                    if (number % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'end' to stop.");
                }
            }

            // Display counts
            System.out.println("Number of even integers: " + evenCount);
            System.out.println("Number of odd integers: " + oddCount);

            // Ask if the user wants to continue
            System.out.println("Options to continue or exit:");
            System.out.println("1. Continue with a new sequence (enter integer 1)");
            System.out.println("2. Exit (enter integer 2)");
            System.out.print("Choose an option (1 or 2): ");
            int option = out.nextInt();
            out.nextLine(); 

            if (option == 2) {
                continueProgram = false;
            }
        }

        System.out.println("Program terminated.");
        out.close();
    }
}

