public class Excercise7 {
}
import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare lengths
        if (str1.length() > str2.length()) {
            System.out.println("String \"" + str1 + "\" is longer than String \"" + str2 + "\"");
        } else if (str1.length() < str2.length()) {
            System.out.println("String \"" + str2 + "\" is longer than String \"" + str1 + "\"");
        } else {
            System.out.println("Both strings are of equal length");
        }

        // Lexicographic comparison
        int lexicographicComparison = str1.compareTo(str2);
        if (lexicographicComparison < 0) {
            System.out.println("String \"" + str1 + "\" appears before String \"" + str2 + "\" in lexicographic order");
        } else if (lexicographicComparison > 0) {
            System.out.println("String \"" + str2 + "\" appears before String \"" + str1 + "\" in lexicographic order");
        } else {
            System.out.println("Both strings are the same in lexicographic order");
        }

        // Create and display a new sentence
        String newSentence = str1 + " " + str2;
        System.out.println("New sentence created is \"" + newSentence + "\"");
    }
}
