package Learning;

import java.util.Scanner;
import java.util.*;

public class marks_Bifurcation {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i;

        do {
            System.out.println("Enter Your marks");
            i = s.nextInt();
            if (i >= 90) {
                System.out.println("Well Done");
            } else if (i >= 60) {
                System.out.println("This is Also good");
            } else if (i >= 40) {
                System.out.println("Keep Going");
            } else if (i >= 20) {
                System.out.println("Work hard");
            } else if (i > 0) {
                System.out.println("Work hard");
                break;
            } else System.out.println("Exit");

        } while (i != 0);

    }
}

