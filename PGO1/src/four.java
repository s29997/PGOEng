import java.util.ArrayList;
public class four {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> sequence = new ArrayList<>();
        ArrayList<Integer> sequence1 = new ArrayList<>();
        ArrayList<Integer> sequence2 = new ArrayList<>();
        ArrayList<Integer> sequence3 = new ArrayList<>();
        sequence1.add(10);
        sequence1.add(20);
        sequence2.add(30);
        sequence2.add(40);
        sequence3.add(5);
        sequence3.add(25);
        sequence.add(sequence1);
        sequence.add(sequence2);
        sequence.add(sequence3);
        System.out.println(getSecondMinimal(sequence));
    }
    public static Integer getSecondMinimal(ArrayList<ArrayList<Integer>> sequence) {
        if (sequence == null || sequence.size() < 2) {
            return null;
        }
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        // Collect all distinct numbers into a separate list
        for (int i = 0; i < sequence.size(); i++) {
            ArrayList<Integer> row = sequence.get(i);
            for (int j = 0; j < row.size(); j++) {
                int num = row.get(j);
                // Check if num is not already in uniqueNumbers
                boolean isUnique = true;
                for (int k = 0; k < uniqueNumbers.size(); k++) {
                    if (uniqueNumbers.get(k) == num) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    uniqueNumbers.add(num);
                }
            }
        }
        // Sort the list of unique numbers
        uniqueNumbers.sort(null);
        // Check if there is a second minimal value
        if (uniqueNumbers.size() > 1) {
            return uniqueNumbers.get(1); // Second element is the second minimal value
        }
        return null; // If no second minimal value found
    }
}