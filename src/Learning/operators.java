package Learning;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int a, b;
        System.out.println("Please enter value of 'a'");
        a = abc.nextInt();
        System.out.println("Please enter value of 'b'");
        b = abc.nextInt();
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(~b);
    }
}
