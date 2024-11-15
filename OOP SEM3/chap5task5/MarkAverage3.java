/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task5;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class MarkAverage3 {
    public double displaymark3() {
        
        int mark, total = 0;
        double average3;
        Scanner read = new Scanner(System.in);
        
        //Loop through each integer the user inputs
       for (int num = 1; num <= 3; num++) {
            // User enters input for each integer
            System.out.print("Enter mark " + num + ": ");
            mark = read.nextInt();
            total += mark; // Accumulate the total of marks
        }

        // Calculate and display the average
        average3 = (double) total / 3;
        System.out.printf("Average mark 1: %.2f\n\n", average3);
        return average3;
    }
}    