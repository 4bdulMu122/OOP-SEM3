/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addition;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

public class Addition {

    public static void main(String[] args) {
        String firstNumber;
        String secondNumber;
        int num1, num2, sum;
        
        firstNumber = JOptionPane.showInputDialog("Enter first integer");
        
        secondNumber = JOptionPane.showInputDialog("Enter second integer");
        
        num1 = Integer.parseInt(firstNumber);
        num2 = Integer.parseInt(secondNumber);
        sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The sum is "+sum, "Results",    JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);

    }
    
}
