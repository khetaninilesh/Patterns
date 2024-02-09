package Learning;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enter student's marks");
            System.out.println("0. Exit");

            System.out.print("Enter your choice (1 or 0): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student's marks (out of 100): ");
                    int marks = scanner.nextInt();

                    if (marks >= 90) {
                        System.out.println("This is Good");
                    } else if (marks >= 60 && marks <= 89) {
                        System.out.println("This is also Good");
                    } else if (marks >= 0 && marks <= 59) {
                        System.out.println("This is Good as well\nBecause marks don’t matter but our effort does.");
                    } else {
                        System.out.println("Invalid marks. Marks should be between 0 and 100.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 0.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}
