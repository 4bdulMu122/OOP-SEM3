/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task3;

/**
 *
 * @author User
 */
public class GradeMarks {

    public char getGrade(int mark) {
        if (mark >= 90) return 'A';
        else if (mark >= 80) return 'B';
        else if (mark >= 70) return 'C';
        else if (mark >= 60) return 'D';
        else return 'E';
    }

    public void gradeCount(int[] gradeCounts, char grade) {
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
}
