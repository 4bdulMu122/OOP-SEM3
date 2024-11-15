/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task2;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class arithmetic {
    public void displaymath(){
        
        int num1, num2;
        
        // Create a Scanner object to read input from the console
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to enter the first integer
        System.out.print("Enter first integer: ");
        // Read the integer input and assign it to num1
        num1 = in.nextInt();
        
        // Prompt the user to enter the second integer
        System.out.print("Enter second integer: ");
        // Read the integer input and assign it to num2
        num2 = in.nextInt();
        
        // Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = num1 / num2;  // Perform integer division
        int remainder = num1 % num2; // Calculate remainder
        
        // Print results of arithmetic operations
        System.out.println("\nArithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + sum);  // Print sum
        System.out.println(num1 + " - " + num2 + " = " + difference);  // Print difference
        System.out.println(num1 + " * " + num2 + " = " + product);  // Print product
        System.out.println(num1 + " / " + num2 + " = " + quotient);  // Print quotient
        System.out.println(num1 + " % " + num2 + " = " + remainder);  // Print remainder
        
        // Close the Scanner object to release resources
        in.close();
    }
}
