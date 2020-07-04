import java.util.function.Predicate;

public class RotationalCipher {
    private static final int ALPHABET_LENGTH = 26;
    private static Predicate<Character> predicate = c -> (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');

    private final int shiftKey;

    RotationalCipher(final int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(final String data) {
        StringBuilder builder = new StringBuilder();

        data
            .chars()
            .forEach(asciiValue -> {
                char c = (char)asciiValue;
                if (predicate.test(c)) {
                    builder.append(rotateCharacter(this.shiftKey, c));
                } else {
                    builder.append(c);
                }
            });

        return builder.toString();
    }

    private static char rotateCharacter(final int shiftKey, final char c) {
        final char baseCharacter = Character.isLowerCase(c) ? 'a' : 'A';
        final int positionInAlphabet = (int)c - (int)baseCharacter;
        final int circularShift = (shiftKey + positionInAlphabet) % ALPHABET_LENGTH;
        return (char)((int) baseCharacter + circularShift);
    }
}
