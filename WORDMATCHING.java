
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class WORDMATCHING {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("baby");
        wordList.add("cat");
        wordList.add("orange");

        String note = "bapidgfahntbgjbniurhbiewaulviurfbvy";

        List<String> matchingWords = findMatchingWords(wordList, note);

        System.out.println("Matching words: " + matchingWords);
    }

    public static List<String> findMatchingWords(List<String> wordList, String note) {
        List<String> matchingWords = new ArrayList<>();

        for (String word : wordList) {
            if (containsAllCharacters(note, word)) {
                matchingWords.add(word);
                break;
            }
        }

        return matchingWords;
    }

    private static boolean containsAllCharacters(String note, String word) {
        Map<Character, Integer> noteCharCount = new HashMap<>();

        for (char c : note.toCharArray()) {
            noteCharCount.put(c, noteCharCount.getOrDefault(c, 0) + 1);
        }

        for (char c : word.toCharArray()) {
            if (!noteCharCount.containsKey(c) || noteCharCount.get(c) == 0) {
                return false;
            }
            noteCharCount.put(c, noteCharCount.get(c) - 1);
        }

        return true;
    }
}
