/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3q1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Task3Q1 {

    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);

        // Ask the user for the maximum value up to which Fibonacci numbers are to be displayed
        System.out.print("Enter the maximum Fibonacci numbers: ");
        int maxValue = out.nextInt();

        // Initialize the first two Fibonacci numbers
        int first = 0;
        int second = 1;

        // Print the Fibonacci series up to the given maximum value
        System.out.println("Fibonacci series up to " + maxValue + ":");

        // Print the first two numbers if they are within the limit
        if (maxValue >= 0) {
            System.out.print(first);
        }
        if (maxValue >= 1) {
            System.out.print(" " + second);
        }

        //display subsequent Fibonacci numbers
        while (true) {
            int next = first + second;

            if (next > maxValue) {
                break;
            }

            System.out.print(" " + next);

            // Update the first and second values
            first = second;
            second = next;
        }

        System.out.println(); 

        out.close();
    }
}
