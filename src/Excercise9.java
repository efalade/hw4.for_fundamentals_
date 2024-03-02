public class Excercise9 {
}
import java.util.Scanner;

public class LastCharOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character: ");
        String inputChar = scanner.nextLine();
        char character = inputChar.charAt(0); // Extract the first character of the input

        // Find the last occurrence of the character in the string
        int lastIndex = inputString.lastIndexOf(character);

        // Display the result
        if (lastIndex == -1) {
            System.out.println("Character '" + character + "' is not found in \"" + inputString + "\"");
        } else {
            System.out.println("Last occurrence of character '" + character + "' in \"" + inputString + "\" is at index " + lastIndex);
        }
    }
}
