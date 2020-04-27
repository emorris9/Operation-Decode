import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        System.out.println("Enter your message:");
        final Scanner console = new Scanner(System.in);
        String input = console.nextLine(); // Will take message
        int code = 0;
        while (code < 1) { // In case user inputs non-positive integer
            System.out.println("Please enter a secret integer pass code greater than 0: ");
            try {
                code = console.nextInt();
            } catch (final InputMismatchException ex) {
                console.next();
            }
        }

        final CryptionResult result = Cryption.Cryption(input, code);
        char start = input.charAt(0);
        char end = input.charAt(input.length() - 1);
        if (start == ' ' && end == ' ') { // conditions for previously encoded message
            System.out.println("Your decoded message is:");
            System.out.println(result.message);
        } else {
            System.out.println("Your encoded message is:");
            System.out.println(" " + result.message + " ");
        }
        System.out.println("Your message has " + result.countChar + " characters");
    }

}
