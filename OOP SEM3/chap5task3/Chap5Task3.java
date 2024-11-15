/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chap5task3;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Chap5Task3 {

    public static void main(String[] args) { 
        int[] marks = new int[10];

        Scanner out = new Scanner(System.in);
        System.out.println("Enter 10 Student marks (0-100):");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = out.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid mark. Enter again (0-100): ");
                marks[i] = out.nextInt();
            }
        }
        out.close();

        GradeMarks gradeMarks = new GradeMarks();
        CountAllGrades countGrades = new CountAllGrades();
        for (int mark : marks) {
            char grade = gradeMarks.getGrade(mark);
            countGrades.gradeCount(grade);
        }

        countGrades.displayCounts();
    }
}
