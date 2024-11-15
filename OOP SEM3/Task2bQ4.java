/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2bq4;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Task2bQ4 {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        
        int evenCount = 0;
        int oddCount = 0;
        boolean continueProgram = true;

        while (continueProgram) {
            evenCount = 0;
            oddCount = 0;

            System.out.println("Enter a sequence of integers (type 'end' to stop):");

            while (true) {
                String input = out.nextLine();
                
                // Check if the input is 'end'
                if (input.length() == 3) {
                    boolean End = true;
                    for (int i = 0; i < 3; i++) {
                        if (input.charAt(i) != "end".charAt(i)) {
                            End = false;
                            break;
                        }
                    }
                    if (End) {
                        break;
                    }
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
            System.out.print("Do you want to enter another sequence? (yes/no): ");
            String response = out.nextLine();

            // Check if the response indicates to stop
            if (response.length() == 2) {
                boolean No = true;
                for (int i = 0; i < 2; i++) {
                    if (response.charAt(i) != "no".charAt(i)) {
                        No = false;
                        break;
                    }
                }
                if (No) {
                    continueProgram = false;
                }
            }
        }

        System.out.println("Program terminated.");
        out.close();
    }
}

