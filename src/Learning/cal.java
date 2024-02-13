package Learning;

import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        int a, b, c;
        System.out.print("a = ");
        a = ax.nextInt();
        System.out.print("b = ");
        b = ax.nextInt();
        System.out.print("c =");
        c = ax.nextInt();

//        Enter 3 numbers from the user & make a function to print their average.
        System.out.println("sum value = " + (a + b + c));
        System.out.println();
    }
}

