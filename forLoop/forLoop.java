package forLoop;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many loop you wanna do? ");
        
        int userInput = sc.nextInt();

        for (int i = 0; i < userInput; i++) {
            System.out.println("Loop Nr. : " + i);
        }

        sc.close();

    }
}
