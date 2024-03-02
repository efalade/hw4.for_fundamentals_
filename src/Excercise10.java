public class Excercise10 {
}
public class DescendingPattern {
    public static void main(String[] args) {
        // Total number of rows for the pattern
        int rows = 6;

        // Outer loop for each row
        for (int i = rows; i > 0; i--) {
            // Inner loop to print asterisks in each row
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
