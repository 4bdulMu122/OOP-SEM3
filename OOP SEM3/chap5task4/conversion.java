/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task4;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class conversion {
    public void displayconvert() { 
        
        Scanner reader = new Scanner(System.in); 
        
        int choice; 
 
        float value, currency, mass, distance, quantity; 
        
        choice = reader.nextInt(); 
        
        switch (choice) {
            case 1: 
                value = 32.3588f; 
                System.out.print("Enter the quantity: RM "); 
                quantity = reader.nextFloat(); 
                currency = value * quantity;
                System.out.printf("RM %.2f = %.2f JPY", quantity, currency);
                break; 
                
            case 2: 
                value = 2.205f; 
                System.out.print("Enter the quantity(kg): "); 
                quantity = reader.nextFloat(); 
                mass = value * quantity; 
                System.out.printf("%.2f kg = %.2f pound", quantity, mass); 
                break; 
                
            case 3: 
                value = 1000.00f; 
                System.out.print("Enter the quantity(km): "); 
                quantity = reader.nextFloat(); 
                distance = value * quantity; 
                System.out.printf("%.2f km = %.2f m", quantity, distance); 
                break; 
                
            default: 
                System.out.println("Invalid choice. Please try again."); 
                break; 
        }
    } 
} 
    
