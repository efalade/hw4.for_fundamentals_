public class Excercise6 {
}
import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number; // Store the original number for display purposes
        int sum = 0;

        // Extract digits and calculate their sum
        while (number != 0) {
            sum += number % 10; // Add the digit in the unit place to sum
            number /= 10; // Remove the digit in the unit place
        }

        System.out.println("Sum of digits of " + originalNumber + " is " + sum);
    }
}
