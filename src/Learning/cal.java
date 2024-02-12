package Learning;

import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        int a = ax.nextInt();
        int b = ax.nextInt();
        int c = ax.nextInt();
        System.out.println("Average value = "+ (a+b+c)/3);
    }
}
