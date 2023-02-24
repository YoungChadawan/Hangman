import java.util.*;
import java.util.List;

public class WordList {
    private static List<Words> list;

    public static String getRandomWord() {
        Random random = new Random();
        return getRandomWord();
    }

    public void initializeNewList() {
        String[] wordString = new String[5];
        for (int i = 0; i < 5; i++) {
            wordString[i] = getRandomWord();
        }
    }

    public void shuffle() {
        
    }
        
}
