public class Excercise5 {
}
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to calculate its factorial: ");
        int number = scanner.nextInt();

        long factorial = 1; // Use long for larger factorial values

        // Calculate the factorial of the number
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Handle the special case for 0
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
