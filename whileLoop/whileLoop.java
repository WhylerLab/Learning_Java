package whileLoop;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many times should i do the loop? ");
        
        int a = sc.nextInt();
        int b = 0;

        while (b != a) {
            System.out.println("Loop Nr. : " + b);
            b++;
        }

        sc.close();

    }
}
