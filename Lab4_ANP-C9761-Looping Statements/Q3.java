// Lab4: Q3 - Mini Calculator with do..while and switch
import java.util.Scanner;

public class Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculation;

        do {
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    break;
            }

            System.out.print("Do you want to continue? (y/n): ");
            continueCalculation = scanner.next().charAt(0);

        } while (continueCalculation == 'y' || continueCalculation == 'Y');

        System.out.println("Calculator closed.");
        scanner.close();
    }
}

/*
Input:
Select an operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
Enter your choice (1-4): 1
Enter first number: 10
Enter second number: 20
Result: 30.0
Do you want to continue? (y/n): n
Output:
Calculator closed.
*/