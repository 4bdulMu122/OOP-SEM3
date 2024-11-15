/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task3;

/**
 *
 * @author User
 */
public class CountAllGrades {

    private int[] gradeCounts;

    public CountAllGrades() {
        gradeCounts = new int[5];
    }

    public void gradeCount(char grade) {
        switch (grade) {
            case 'A':
                gradeCounts[0]++;
                break;
            case 'B':
                gradeCounts[1]++;
                break;
            case 'C':
                gradeCounts[2]++;
                break;
            case 'D':
                gradeCounts[3]++;
                break;
            case 'E':
                gradeCounts[4]++;
                break;
        }
    }

    public void displayCounts() {
        System.out.println("Out of 10:");
        System.out.println("Grade A: " + gradeCounts[0]);
        System.out.println("Grade B: " + gradeCounts[1]);
        System.out.println("Grade C: " + gradeCounts[2]);
        System.out.println("Grade D: " + gradeCounts[3]);
        System.out.println("Grade E: " + gradeCounts[4]);
    }
}
