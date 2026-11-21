package math;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int firstNumber;
        int secondNumber = 5;

        System.out.print("Please input a number: ");
        firstNumber = sc.nextInt();

        System.out.println("summation: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println("subtraction: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println("multiplication: " + firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println("division: " + firstNumber + " / " + secondNumber + " = " + ((double) firstNumber / secondNumber));

        sc.close();

    }
}
