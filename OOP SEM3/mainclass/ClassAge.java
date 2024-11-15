/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainclass;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class ClassAge {
        public void displayAge(){
    String firstAge;
    String secondAge;
    int num1, num2, sum;
    
    firstAge = JOptionPane.showInputDialog("Enter Muizz Age");
    
    secondAge = JOptionPane.showInputDialog("Enter Roth Age");
    
    num1 = Integer.parseInt(firstAge);
    num2 = Integer.parseInt(secondAge);
    sum = num1 + num2;
    
    JOptionPane.showMessageDialog(null, "The sum of Age is "+sum, "Results",JOptionPane.PLAIN_MESSAGE);
    
    System.exit(0);
        }
}
