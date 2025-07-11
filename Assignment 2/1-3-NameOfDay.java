package Java;

import java.util.Scanner;

public class NameOfDay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day number(1->7): ");
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Not valid number");
        }

    }
}
