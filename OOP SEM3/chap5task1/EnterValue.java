/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class EnterValue {
    public int[] displayValue() {
    Scanner read = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int num1 = read.nextInt();

    System.out.print("Enter second integer: ");
    int num2 = read.nextInt();

    System.out.print("Enter third integer: ");
    int num3 = read.nextInt();        
    
    read.close();
    return new int[]{num1, num2, num3};
    }
}
