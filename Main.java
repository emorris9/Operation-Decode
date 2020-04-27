import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        System.out.println("Enter your message:");
        final Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        System.out.println("Enter your secret code:");
        int code = console.nextInt();

        String result = "";
        StringBuilder sb = new StringBuilder(result);

        int countchar = 0;
        char start = input.charAt(0);
        char end = input.charAt(input.length() - 1);
        int temp = (code + 24) % 16 * 3 - 5;

        if (start == ' ' && end == ' ') {
            for (int i = 1; i < input.length() - 1; i++) {
                char c = input.charAt(i);
                c += (temp);
                sb.insert((i - 1), c);
                countchar++;
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                c -= (temp);
                sb.insert(i, c);
                countchar++;
            }
        }

        if (start == ' ' && end == ' ') {
            System.out.println("Your decoded message is:");
            System.out.println(sb);
        } else {
            System.out.println("Your encoded message is:");
            System.out.println(" " + sb + " ");
        }
        System.out.println("Your message has " + countchar + " characters");
    }
}