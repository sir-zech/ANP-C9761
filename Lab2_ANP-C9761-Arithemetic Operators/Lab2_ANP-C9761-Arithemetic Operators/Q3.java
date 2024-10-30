// Lab2: Q3 - Find area and perimeter of square
import java.util.Scanner;

public class Lab2Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();

        double perimeter = 4 * side;
        double area = side * side;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        scanner.close();
    }
}

/*
Input:
Enter the side of the square: 5
Output:
Perimeter: 20.0
Area: 25.0
*/