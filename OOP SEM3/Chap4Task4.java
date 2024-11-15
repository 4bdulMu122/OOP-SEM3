/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chap4task4;

/**
 *
 * @author User
 */
public class Chap4Task4 {
    public static void main(String[] args) {
        int SumOfPowers = 0;

        System.out.println("Power of two (2^n) for integers 1 to 10:");
        
        for (int n = 1; n <= 10; n++) {
            int PowerOfTwo = 1;
            for (int i = 0; i < n; i++) {
                PowerOfTwo *= 2;
            }
            System.out.println("2^" + n + " = " + PowerOfTwo);
            
            SumOfPowers += PowerOfTwo;
        }

        System.out.println("Sum of 2^1 to 2^10: " + SumOfPowers);
    }
}
