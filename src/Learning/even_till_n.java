package Learning;

import java.util.Scanner;

public class even_till_n {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();

        //print all even numbers <=n
        for (int i=1; i<=n; i++) {
            if(i%2==0) {
                System.out.print(i+"  ");
            }
        }
    }
}
