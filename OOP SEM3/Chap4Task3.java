/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chap4task3;

/**
 *
 * @author User
 */
public class Chap4Task3 {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        String evenNumbers = "";
        String oddNumbers = "";
        
        System.out.println("Display Numbers:");
        for (int i = 1; i <= 10; i++) {
        System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
           
            if (i % 2 == 0) {
                
                evenSum += i;
                evenNumbers += i + " ";
            } else {
                
                oddSum += i;
                oddNumbers += i + " "; 
            }
        }
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Even numbers: " + evenNumbers);         
        
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);        
    }
}
