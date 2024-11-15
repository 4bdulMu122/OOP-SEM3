/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradingsystemmuizz;

import java.util.Scanner; // Importing Scanner class for user input
import javax.swing.JOptionPane; // Importing JOptionPane 

public class GradingSystemMuizz { // Main class

    public static void main(String[] args) { // Main method
        Scanner saya = new Scanner(System.in); // Creating Scanner object for input
        
        boolean continueProgram = true; // Flag to control program loop

        while (continueProgram) { // Loop until user decides to exit
            System.out.print("Enter Number of Students: "); // Prompting for number of students
            int numberOfStudents = saya.nextInt(); // Reading the number of students
            int[] marks = new int[numberOfStudents]; // Array to store student marks

            System.out.println("Enter Student marks (A >= 80,B >= 70,C >= 60,D >= 40,F <= 40):"); // Prompt for marks
            for (int i = 0; i < marks.length; i++) { // Loop through each student
                System.out.print("Student " + (i + 1) + ": "); // Prompt for each student's mark
                marks[i] = saya.nextInt(); // Reading the mark for the student

                // Validating the mark
                while (marks[i] < 0 || marks[i] > 100) { // Check if the mark is valid
                    System.out.print("Invalid mark. Enter again (0-100): "); // Prompt for valid mark
                    marks[i] = saya.nextInt(); 
                } 
            } 
            
            // Creating objects for grade calculations
            GradeMarks gradeMarks = new GradeMarks(); // Object to get grades
            CountAllGrades countGrades = new CountAllGrades(); // Object to count grades

            // Counting the grades
            for (int mark : marks) { // Loop 
                char grade = gradeMarks.getGrade(mark); // Get the grade for the mark
                countGrades.gradeCount(grade); // Count the grade
            } 

            countGrades.displayCounts(); // Display the counts of grades
            
            // Creating objects for student pass/fail status
            StudentStatus studentStatus = new StudentStatus(); // Object to get student status
            CountAllStudentGrades countStudent = new CountAllStudentGrades(); // Object to count pass/fail

            // Counting student statuses
            for (int mark : marks) { // Loop 
                char grade = studentStatus.getGrade(mark); // Get the pass/fail status
                countStudent.amountStudent(grade); // Count the status
            } 

            countStudent.displayStatus(); // Display pass/fail counts

            // Determining bonus for the instructor
            if (countStudent.gradeCounts[0] > countStudent.gradeCounts[1]) { // If passed students > failed students
                JOptionPane.showMessageDialog(null, "Bonus to instructor"); // Show bonus message
            } else { // If not
                JOptionPane.showMessageDialog(null, "No bonus for instructor"); // Show no bonus message
            } 

            // Asking user if they want to continue
            System.out.print("Do you want to enter marks for another class? (yes/no): ");
            String response = saya.next().toLowerCase(); // Reading user response
            if (!response.equals("yes")) { // If response is not 'yes', exit the loop
                continueProgram = false;
            }
        }

        saya.close(); // Close the Scanner
        System.out.println("Exiting the program. Goodbye!"); // Goodbye message
    } 

    // Class to determine letter grades
    static class GradeMarks { 
        public char getGrade(int mark) { // Method to get letter grade based on mark
            if (mark >= 80) return 'A'; 
            else if (mark >= 70) return 'B'; 
            else if (mark >= 60) return 'C'; 
            else if (mark >= 40) return 'D'; 
            else return 'F'; 
        } 
    } 

    // Class to count occurrences of each grade
    static class CountAllGrades { 
        private int[] gradeCounts; // Array to hold counts of each grade

        public CountAllGrades() { 
            gradeCounts = new int[5]; // Initializing array for 5 grades 
        } 

        // Method to count the grades
        public void gradeCount(char grade) { 
            switch (grade) { // Determine which grade to count
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
                case 'F': 
                    gradeCounts[4]++; 
                    break; 
            } 
        } 

        // Method to display grade counts
        public void displayCounts() { 
            System.out.println("\nOut of " + (gradeCounts[0] + gradeCounts[1] + gradeCounts[2] + gradeCounts[3] + gradeCounts[4]) + ":"); // Displaying total grades
            System.out.println("Grade A: " + gradeCounts[0]); 
            System.out.println("Grade B: " + gradeCounts[1]); 
            System.out.println("Grade C: " + gradeCounts[2]); 
            System.out.println("Grade D: " + gradeCounts[3]); 
            System.out.println("Grade F: " + gradeCounts[4]); 
        } 
    } 

    // Class to determine student pass/fail status
    static class StudentStatus { 
        public char getGrade(int mark) { // Method to get pass/fail status based on mark
            if (mark >= 40) return 'P'; 
            else return 'F'; 
        } 
    } 

    // Class to count student pass/fail statuses
    static class CountAllStudentGrades { 
        public int[] gradeCounts; // Array to hold pass/fail counts

        public CountAllStudentGrades() { 
            gradeCounts = new int[2]; // Initializing array For 2 (Passed or Failed)
        } 

        // Method to count student statuses
        public void amountStudent(char grade) { 
            switch (grade) { 
                case 'P': 
                    gradeCounts[0]++; 
                    break; 
                case 'F': 
                    gradeCounts[1]++; 
                    break; 
            } 
        } 
        
        // Method to display student status counts
        public void displayStatus() { 
            System.out.println("\nStudent Status:"); 
            System.out.println("Passed: " + gradeCounts[0]); 
            System.out.println("Failed: " + gradeCounts[1]); 
        } 
    } 
}
