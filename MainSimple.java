import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSimple {

  public static void main(final String[] args) {

    System.out.println("Enter your message:");
    final Scanner console = new Scanner(System.in);
    String input = console.nextLine();
    String result = "";
    StringBuilder sb = new StringBuilder(result);
    if (input.substring(0) == "-") {
      for (int i = 1; i < input.length(); i++) {
        char c = input.charAt(i);
        c -= 2;
        sb.insert(i, c);
      }
    } else {
      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        c += 2;
        sb.insert(i, c);
      }
    }
    if (input.substring(0) == "-") {
      System.out.println("Your decoded message is: " + sb);
    } else {
      System.out.println("Your encoded message is: -" + sb);
    }
  }
}
