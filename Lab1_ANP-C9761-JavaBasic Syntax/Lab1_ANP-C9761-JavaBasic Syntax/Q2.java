// Lab1: Q2 - Welcome message with user name
import java.util.Scanner;

public class Lab1Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");
        scanner.close();
    }
}

/*
Input:
Enter your name: Moulimonish
Output:
Welcome, Moulimonish!
*/