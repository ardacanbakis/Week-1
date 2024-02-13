// The number of different groups of r elements that can be formed with the elements of a set of n elements is called the combination of n with r. The combination of n with r is denoted as C(n,r).
//
//This program computes this combination using the Java language.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        // Check n >= r
        if (n < r) {
            System.out.println("Invalid input");
        }

        // Check n >= 0
        else if (n < 0) {
            System.out.println("Invalid input");
        }

        // Check r >= 0
        else if (r < 0) {
            System.out.println("Invalid input");
        }

        // Calculate nCr
        int nCr = factorial(n) / (factorial(r) * factorial(n - r));

        // Display the result
        System.out.println("nCr = " + nCr);

        // Close the scanner
        scanner.close();
    }

    // Calculate factorial
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; ++i) {
            result *= i;
        }
        return result;
    }
}