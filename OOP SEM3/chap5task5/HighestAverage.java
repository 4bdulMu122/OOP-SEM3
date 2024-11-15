/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task5;

/**
 *
 * @author User
 */
public class HighestAverage {
    public void displayHighAverage() {
        
        double highaverage;
        
        MarkAverage1 student1 = new MarkAverage1();
        
        MarkAverage2 student2 = new MarkAverage2();
        
        MarkAverage3 student3 = new MarkAverage3();
        
        highaverage = Math.max(student1.displaymark1(), Math.max(student2.displaymark2(), student3.displaymark3()));
        
        System.out.printf("The highest average is %.2f\n", highaverage);
    }
    
}
