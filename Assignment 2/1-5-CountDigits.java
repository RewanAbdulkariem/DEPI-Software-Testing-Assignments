package Java;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();
        int counter = 0;
        while (number > 0){
            counter ++;
            number = number / 10;
        }
        System.out.println("Number of Digits "+ counter);

    }
}
