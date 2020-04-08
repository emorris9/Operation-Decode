import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        //read data
        System.out.println("Enter your message here:");
        final Scanner console = new Scanner(System.in); //look at scanner API
        final List<String> letter = new ArrayList<>();
        while (console.hasNext()) { //try has
            final String value = console.next();
            letter.add(value);

        }
        System.out.println("Your message is: " + letter) ;
        final String result = CodeMath.CodeMath(letter);
    }

}
