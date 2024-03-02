public class Excercise4 {
}
public class FibonacciSeries {
    public static void main(String[] args) {
        // Set the count of Fibonacci numbers to display
        int count = 30;

        // Initialize the first two numbers of the Fibonacci series
        int num1 = 0, num2 = 1;

        System.out.println("The first " + count + " Fibonacci numbers are:");

        // Loop to calculate and print the first 30 Fibonacci numbers
        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");

            // Calculate the next number in the series
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
