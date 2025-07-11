package Java;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the grade");
        char grade = input.next().charAt(0);

        grade = Character.toUpperCase(grade);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
