public class Cryption {
    public static CryptionResult Cryption(final String input, final int code) {
        StringBuilder sb = new StringBuilder();
        char start = input.charAt(0);
        char end = input.charAt(input.length() - 1);
        int temp = (code + 24) % 16 * 3 - 5;

        if (start == ' ' && end == ' ') {
            for (int i = 1; i < input.length() - 1; i++) {
                char c = input.charAt(i);
                c += (temp);
                sb.insert((i - 1), c);
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                c -= (temp);
                sb.insert(i, c);
            }
        }
        return sb.toString();
        CryptionResult
    }
}
