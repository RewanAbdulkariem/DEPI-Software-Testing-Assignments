package Java;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your nationality: ");
        String nationality = input.nextLine();
        if (age >= 18 && nationality.equalsIgnoreCase( "egyptian")){
            System.out.println( "Eligible to vote");
        }
        else {
            System.out.println( "Not eligible");
        }
    }
}
