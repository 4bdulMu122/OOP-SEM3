/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chap5task1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Chap5Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnterValue myEnterValue = new EnterValue();
        int[] value = myEnterValue.displayValue();
    
        MaximumValue myMaximumValue = new MaximumValue(value);
        myMaximumValue.displayMax();
        
        MinimumValue myMinimumValue = new MinimumValue(value);
        myMinimumValue.displayMin();        
    }
}