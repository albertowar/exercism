import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RotationalCipher {
    private static final int ALPHABET_LENGTH = 26;

    private final int shiftKey;

    RotationalCipher(final int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(final String data) {
        return data
            .chars()
            .mapToObj(c -> Pattern.matches("[A-Za-z]", String.valueOf((char)c)) ?
                String.valueOf(rotateCharacter(this.shiftKey, (char)c)) :
                String.valueOf((char)c))
            .collect(Collectors.joining());
    }

    private static char rotateCharacter(final int shiftKey, final char c) {
        final char baseCharacter = Character.isLowerCase(c) ? 'a' : 'A';
        final int positionInAlphabet = (int)c - (int)baseCharacter;
        final int circularShift = (shiftKey + positionInAlphabet) % ALPHABET_LENGTH;
        return (char)((int) baseCharacter + circularShift);
    }
}
