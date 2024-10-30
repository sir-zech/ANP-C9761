// Lab4: Q1 - Reverse a given number
import java.util.Scanner;

public class Lab4Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}

/*
Input:
Enter a number: 1234
Output:
Reversed number: 4321
*/