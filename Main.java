import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        //read data
        final Scanner console = new Scanner(System.in);
        final List<String> letter = new ArrayList<>();
        while (console.hasNext()) {
            final String value = console.next();
            letter.add(value);

        }
        System.out.println("Your message is: " + letter) ;
    }
}
