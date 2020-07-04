import java.util.AbstractMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Scrabble {
    private static final Map<Character, Integer> scoresMap = Map.ofEntries(
      new AbstractMap.SimpleEntry<Character, Integer>('A', 1),
      new AbstractMap.SimpleEntry<Character, Integer>('E', 1),
      new AbstractMap.SimpleEntry<Character, Integer>('I', 1),
      new AbstractMap.SimpleEntry<Character, Integer>('O', 1),
      new AbstractMap.SimpleEntry<Character, Integer>('U', 1),
      new AbstractMap.SimpleEntry<Character, Integer>('L', 1),
      new AbstractMap.SimpleEntry<Character, Integer>('N', 1),
      new AbstractMap.SimpleEntry<Character, Integer>('R', 1),
      new AbstractMap.SimpleEntry<Character, Integer>('S', 1),
      new AbstractMap.SimpleEntry<Character, Integer>('T', 1),
      new AbstractMap.SimpleEntry<Character, Integer>('D', 2),
      new AbstractMap.SimpleEntry<Character, Integer>('G', 2),
      new AbstractMap.SimpleEntry<Character, Integer>('B', 3),
      new AbstractMap.SimpleEntry<Character, Integer>('C', 3),
      new AbstractMap.SimpleEntry<Character, Integer>('M', 3),
      new AbstractMap.SimpleEntry<Character, Integer>('P', 3),
      new AbstractMap.SimpleEntry<Character, Integer>('F', 4),
      new AbstractMap.SimpleEntry<Character, Integer>('H', 4),
      new AbstractMap.SimpleEntry<Character, Integer>('V', 4),
      new AbstractMap.SimpleEntry<Character, Integer>('W', 4),
      new AbstractMap.SimpleEntry<Character, Integer>('Y', 4),
      new AbstractMap.SimpleEntry<Character, Integer>('K', 5),
      new AbstractMap.SimpleEntry<Character, Integer>('J', 8),
      new AbstractMap.SimpleEntry<Character, Integer>('X', 8),
      new AbstractMap.SimpleEntry<Character, Integer>('Q', 10),
      new AbstractMap.SimpleEntry<Character, Integer>('Z', 10)
    );

    public static int getScore(String word) {
        return word
            .toUpperCase()
            .chars()
            .mapToObj(c -> (char)c)
            .filter(charToFilter -> Pattern.matches("[A-Z]", String.valueOf(charToFilter)))
            .map(scoresMap::get)
            .mapToInt(Integer::valueOf)
            .sum();
    }
}
