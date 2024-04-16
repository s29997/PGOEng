import java.util.ArrayList;
public class three{
    public static void main(String[] args) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);
        sequence.add(2);
        sequence.add(3);
        sequence.add(4);
        System.out.println(getSecondUnique(sequence));
    }
    public static Integer getSecondUnique(ArrayList<Integer> sequence) {
        if (sequence == null || sequence.size() < 2) {
            return null;
        }
        // Count the frequency of each integer in the sequence
        int[] frequencyArray = new int[10000];
        for (int i = 0; i < sequence.size(); i++) {
            int num = sequence.get(i);
            frequencyArray[num]++;
        }
        // Finding the second unique integer
        int uniqueCount = 0;
        for (int i = 0; i < sequence.size(); i++) {
            int num = sequence.get(i);
            if (frequencyArray[num] == 1) {
                uniqueCount++;
                if (uniqueCount == 2) {
                    return num;
                }
            }
        }
        return null; // No second unique integer found
    }
}