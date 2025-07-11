package Java;

import java.util.Scanner;

public class ResultsStudentsInfo {
    public static float calculateAverage(float score1, float score2, float score3){
        return (score1 + score2 + score3)/3;
    }
    public static char gradeInfo(float average){
        if (average >= 85){
            return 'A';
        } else if (average >= 70) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        }else {
            return 'F';
        }

    }
    public static void main(String[] args){
        String studentName;

        float score1;
        float score2;
        float score3;

        float average;
        char grade;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numberOfStudents; i++){
            System.out.print("Enter student name: ");
            studentName = input.nextLine();

            System.out.println("----------Enter Three Exam Score---------");

            System.out.print("Enter score of exam 1: ");
            score1 = input.nextFloat();

            System.out.print("Enter score of exam 2: ");
            score2 = input.nextFloat();

            System.out.print("Enter score of exam 3: ");
            score3 = input.nextFloat();

            input.nextLine();
            average = calculateAverage(score1, score2, score3);
            grade = gradeInfo(average);
            System.out.println("Student: " + studentName + " | Average: " + average + " | Grade: " + grade + "\n");
        }

    }
}
