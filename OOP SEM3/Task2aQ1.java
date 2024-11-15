/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2aq1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Task2aQ1 {
    public static void main(String[] args) {
        String correctPassword = "password123";

        int maxAttempts = 3;

        Scanner out = new Scanner(System.in);

        int attempts = 0;

        while (attempts < maxAttempts) {

            System.out.print("Enter your password: ");
            String inputPassword = out.nextLine();

            if (PasswordCorrect(inputPassword, correctPassword)) {
                System.out.println("Access granted.");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect password. You have " + (maxAttempts - attempts) + " attempt(s) left.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Access denied. You have used all your attempts.");
        }

        out.close();
    }

    public static boolean PasswordCorrect(String input, String correct) {
        if (input.length() != correct.length()) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != correct.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
