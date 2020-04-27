import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtherMain {

    public static void main(final String[] args) {

        System.out.println("Enter your message:");
        final Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        System.out.println("Enter your secret code:");
        int code = console.nextInt();
        final String result = Cryption.Cryption(input, code);
        char start = input.charAt(0);
        char end = input.charAt(input.length() - 1);
        if (start == ' ' && end == ' ') {
            System.out.println("Your decoded message is:");
            System.out.println(result);
        } else {
            System.out.println("Your encoded message is:");
            System.out.println(" " + result + " ");
        }
    }

}
