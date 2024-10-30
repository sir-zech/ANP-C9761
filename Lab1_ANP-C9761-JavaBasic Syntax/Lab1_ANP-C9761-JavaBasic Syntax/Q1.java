// Lab1: Q1 - Arithmetic operations (input from command prompt)
public class Lab1Q1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers.");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not possible.");
        }
    }
}

/*
Output:
Addition: 8.0
Subtraction: 2.0
Multiplication: 15.0
Division: 1.6666666666666667
*/