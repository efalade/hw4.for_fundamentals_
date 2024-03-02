package java.Exercise2;

public class Excercise3 {
}
import java.util.Scanner;

public class GradeExtremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highestGrade = Integer.MIN_VALUE;
        int lowestGrade = Integer.MAX_VALUE;
        System.out.println("Enter student grades (enter 'c' to finish):");

        // Loop to accept grades from the user
        while (scanner.hasNextInt()) {
            int grade = scanner.nextInt();
            if (grade > highestGrade) {
                highestGrade = grade;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }

            System.out.println("Enter another grade or 'c' to finish:");
        }

        // Check if any grades were entered and display highest and lowest grades
        if (highestGrade == Integer.MIN_VALUE || lowestGrade == Integer.MAX_VALUE) {
            System.out.println("No grades were entered.");
        } else {
            System.out.println("Highest student grade is " + highestGrade);
            System.out.println("Lowest student grade is " + lowestGrade);
        }
    }
}
