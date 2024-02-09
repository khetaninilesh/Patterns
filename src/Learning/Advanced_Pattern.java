package Learning;

import java.util.Scanner;

public class Advanced_Pattern {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter Raw");
        int raw = abc.nextInt();
// Print solid Butterfly Pattern
//        First Half
        /*for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            Space
            int space = 2 * (raw - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        Lower Half
        for (int i = raw; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            Space
            int space = 2 * (raw - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
//        Print Hollow butterfly Pattern
        for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= i; j++) {
                if (j==1||j==i)
                System.out.print("*");
                else System.out.print(" ");
            }
//            Space
            int space = 2 * (raw - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j==1||j==i)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
//        Lower Half
        for (int i = raw; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j==1||j==i)
                System.out.print("*");
                else System.out.print(" ");
            }
//            Space
            int space = 2 * (raw - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j==1||j==i)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
//        Diamond Pattern
       /* for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= raw - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = raw; i>=1; i--){
            for (int j= 1; j<=raw-i;j++){
                System.out.print(" ");}
            for (int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


    }
}

