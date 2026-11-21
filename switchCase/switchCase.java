package switchCase;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int playerInput;

        System.out.print("Please enter a number 1,2 or 3 :");
        playerInput = sc.nextInt();


        switch (playerInput) {
            case 1:
                System.out.println("Your choice was 1");
                break;
            
            case 2:
                System.out.println("Your choice was 2");
                break;
            
            case 3:
                System.out.println("Yur choice was 3");
                break;
            default:
                break;
        }

        sc.close();

    }
}
