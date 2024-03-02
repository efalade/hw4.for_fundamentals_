public class Excercise8 {
}
import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();

        String reversedString = "";
        // Reverse the string by iterating from the end to the start
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }

        System.out.println("Reverse of \"" + inputString + "\" is \"" + reversedString + "\"");
    }
}
