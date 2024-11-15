/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2aq2;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Task2aQ2 {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = out.nextInt();

        int passCount = 0;
        int failCount = 0;

        out.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter result for student " + (i + 1) + " (pass/fail): ");
            String result = out.nextLine();

            if (result.equals("pass")) {
                passCount++;
            } else if (result.equals("fail")) {
                failCount++;
            } else {
                System.out.println("Invalid input. Please enter 'pass' or 'fail'.");
                i--; 
            }
        }

        System.out.println("Number of students who passed: " + passCount);
        System.out.println("Number of students who failed: " + failCount);

        if (passCount > numberOfStudents / 2) {
            System.out.println("Bonus to instructor");
        }

        out.close();
    }
}
