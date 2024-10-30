// Lab3: Q3 - Check voting eligibility
import java.util.Scanner;

public class Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        scanner.close();
    }
}

/*
Input:
Enter your age: 20
Output:
Eligible to vote.
*/