package firstInput;

import java.util.Scanner;

public class firstInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userInput = sc.nextLine();

        System.out.println("Hello " + userInput + " !");

        sc.close();

    }
}
