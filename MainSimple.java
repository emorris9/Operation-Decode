import java.util.Scanner;

public class MainSimple {

  public static void main(final String[] args) {

    System.out.println("Enter your message:");
    final Scanner console = new Scanner(System.in);
    String input = console.nextLine();
    String result = "";
    StringBuilder sb = new StringBuilder(result);
    char start = input.charAt(0);

    if (start == '-') {
      for (int i = 1; i < input.length(); i++) {
        char c = input.charAt(i);
        c -= 2;
        sb.insert((i-1), c);
      }
    } else {
      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        c += 2;
        sb.insert(i, c);
      }
    }
    if (start == '-') {
      System.out.println("Your decoded message is: " + sb);
    } else {
      System.out.println("Your encoded message is: -" + sb);
    }
  }
}
