// Lab2: Q1 - Convert Celsius to Fahrenheit and vice versa
import java.util.Scanner;

public class Lab2Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();
    }
}

/*
Input:
Enter temperature in Celsius: 0
Output: Temperature in Fahrenheit: 32.0

Input:
Enter temperature in Fahrenheit: 32
Output: Temperature in Celsius: 0.0
*/