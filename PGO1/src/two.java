import java.util.ArrayList;
public class two {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> paragraph = new ArrayList<>();
        ArrayList<String> sentence1 = new ArrayList<>();
        ArrayList<String> sentence2 = new ArrayList<>();
        ArrayList<String> sentence3 = new ArrayList<>();
        sentence1.add("ala");
        sentence1.add("ma");
        sentence1.add("kota");
        sentence2.add("ala");
        sentence2.add("ma");
        sentence2.add("psa");
        sentence3.add("ala");
        sentence3.add("lubi");
        sentence3.add("ryb");
        paragraph.add(sentence1);
        paragraph.add(sentence2);
        paragraph.add(sentence3);
        System.out.println(getParagraphMostOccurredWord(paragraph));
    }
    public static String getParagraphMostOccurredWord(ArrayList<ArrayList<String>> paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            return null;
        }
        // empty paragraph check
        ArrayList<String> allWords = new ArrayList<>();
         for (int i = 0; i < paragraph.size(); i++) {
            ArrayList<String> sentence = paragraph.get(i);
            for (int j = 0; j < sentence.size(); j++) {
                allWords.add(sentence.get(j));
            }
        }
         // paragraph "decryption"
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