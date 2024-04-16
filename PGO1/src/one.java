import java.util.ArrayList;
public class one {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("ala");
        words.add("dog");
        words.add("cat");
        words.add("cat");
        words.add("monkey");
        words.add("mouse");
        System.out.println(getSentenceMostOccurredWord(words));
    }
    public static String getSentenceMostOccurredWord(ArrayList<String> allWords) {
        if (allWords == null || allWords.isEmpty()) {
            return null;
        }
        String mostOccurredWord = null;
        int maxFrequency = 0;
        for (int i = 0; i < allWords.size(); i++) {
            String currentWord = allWords.get(i);
            int currentFrequency = 1;
            for (int j = i + 1; j < allWords.size(); j++) {
                if (currentWord.equals(allWords.get(j))) {
                    currentFrequency++;
                }
            }
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostOccurredWord = currentWord;
            }
        }
        return mostOccurredWord;
        // most occurred word check module
    }
}