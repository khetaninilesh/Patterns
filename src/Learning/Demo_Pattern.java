package Learning;

import java.util.Scanner;

public class Demo_Pattern {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int raw;
        int colu;
        System.out.println("Enter Raw ");
        raw = abc.nextInt();
        System.out.println("Enter Column");
        colu = abc.nextInt();
//        Get raw and column value from keyboard and print * in box
        /*int raw, colu;
        System.out.println("Enter Raw ");
        raw = abc.nextInt();
        System.out.println("Enter Column");
        colu = abc.nextInt();

        for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= colu; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
//       Print * on border of box
        /*int raw, colu;
        System.out.println("Enter Raw ");
        raw = abc.nextInt();
        System.out.println("Enter Column");
        colu = abc.nextInt();
        for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= colu; j++) {
                if (i == 1 || j == 1 || i == raw || j == colu) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }        System.out.println();

        }*/
//        Print * in triangle shape ( from start *, **, ***)
       /* int raw, colu;
        System.out.println("Enter Raw ");
        for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= raw; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//      Print * in triangle shape (from start ***, **,*)
        /*for (int i = raw; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
//        Print * in triangle shape (From back *,**,***)
     /*   for (int i = 1; i <= raw; i++) {
            //for space print
            for (int j = 1; j <= raw - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }*/
//        To print pyramid of number(1, 1 2, 1 2 3)
       /* for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

//        To Print pyramid of number (1 2 3, 1 2, 1)
        /*for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= raw-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/
//        Print Floyd's triangle
        /*int number=1;
        for (int i = 1; i <=raw; i++){
            for (int j =1; j <= i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }*/
//        Print 0-1 triangle
       /* for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/
//        Print a solid rhombus
       /* for (int i = 1; i <=raw; i++){
            for (int j =1; j <= raw-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j <=colu; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
//        Print hollow rhombus
        /*for (int i = 1; i <= raw; i++) {
            // Print trailing spaces
            for (int j = 1; j <= raw - i; j++)
                System.out.print(" ");
            // Print stars for each solid rows
            for (int j =1; j <=raw; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
//        Print number pyramid 1,22,333,4444,...
        /*for (int i = 1; i <= raw; i++) {
            for (int j =1; j<=raw-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }*/
//        Print Number pyramid 1,121,12321,1234321)
      /*  for (int i = 1; i <= raw; i++) {
            for (int j = i; j <= raw; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j +"");
            for (int j = i-1; j >= 1; j--) System.out.print(j + "");
            System.out.println();
        }*/
//        Print number pyramid 1,212,32123,4321234
        for (int i = 1; i <= raw; i++) {
            for (int j = 1; j <= raw - i; j++) System.out.print(" ");
            for (int j = i; j >= 1; j--) System.out.print(j);
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            System.out.println();
        }
    }
}

