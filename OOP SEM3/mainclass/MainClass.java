/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainclass;

public class MainClass {
    public static void main(String[] args) {
        GradeBook myGradeBook = new GradeBook();
        myGradeBook.displayMessage();
    
        NameInClass myNameInClass = new NameInClass();
        myNameInClass.displayName();
        
        ClassAge myClassAge = new ClassAge();
        myClassAge.displayAge();        
    }
}