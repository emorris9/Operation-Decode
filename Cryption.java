public class Cryption {
    public static CryptionResult Cryption(final String input, final int code) {
        StringBuilder sb = new StringBuilder(); // final message will be placed here
        int countChar = 0; // this is for counting the amount of characters
        char start = input.charAt(0);
        char end = input.charAt(input.length() - 1);
        int temp = (code + 24) % 16 * 3 - 5; // Math for Encryption

        if (start == ' ' && end == ' ') { // Decoding the message
            for (int i = 1; i < input.length() - 1; i++) {
                char c = input.charAt(i);
                c += (temp);
                sb.insert((i - 1), c);
                countChar++;
            }
        } else { // Encoding the message
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                c -= (temp);
                sb.insert(i, c);
                countChar++;
            }
        }
        return new CryptionResult(sb.toString(), countChar);
    }
}
