// Lab2: Q2 - Employee allowances based on salary
import java.util.Scanner;

public class Lab2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        double da = salary * 0.12;
        double hra = salary * 0.13;
        double pf = salary * 0.15;
        double gross = salary + da + hra - pf;

        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + gross);

        scanner.close();
    }
}

/*
Input:
Enter employee salary: 20000
Output:
DA: 2400.0
HRA: 2600.0
PF: 3000.0
Gross Salary: 21600.0
*/