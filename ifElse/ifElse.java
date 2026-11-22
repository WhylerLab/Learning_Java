package ifElse;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Blue or Red? ");
        String userInput = sc.next();

        if (userInput.equalsIgnoreCase("blue")) {
            System.out.println("Your choice was BLUE!");
        } else if (userInput.equalsIgnoreCase("red")) {
            System.out.println("Your choice was RED!");
        } else {
            System.out.println("You need to choose Blue or Red.");
        }
        
        sc.close();
    }
}
