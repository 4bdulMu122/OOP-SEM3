/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3q2;

/**
 *
 * @author User
 */
public class Task3Q2 {
    public static void main(String[] args) {
        int n = 5; // Predefined value for n
        int factorial = 1;

        // Compute factorial using an iterative method
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.print(n + "! = ");
        for (int i = n; i > 1; i--) {
            System.out.print(i + " * ");
        }
        System.out.print("1 = " + factorial);
    }
}

/*import java.util.Scanner;
public class Task3Q2 {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);

        // Prompt user for the value of n
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int n = out.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            String factorialExp = "";

            // count factorial using an iterative method
            for (int i = 1; i <= n; i++) {
                factorial *= i;

                if (i == 1) {
                    factorialExp += i;
                } else {
                    factorialExp += " * " + i;
                }
            }

            // Display the result
            System.out.println(n + "! = " + factorialExp + " = " + factorial);
        }

        out.close();
    }
}
*/