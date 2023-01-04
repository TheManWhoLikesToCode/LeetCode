import java.util.HashMap;

class Solution {
    public int minSetSize(int[] arr) {
        
        int currentLength = arr.length;
        int goalLength = currentLength / 2;

        // Parse the array and track how many occurances of each element their are
        HashMap<Integer, Integer> NumberTracker = new HashMap<>();
        // Key = Number, Value = Occurances 
        for (int i = 0; i < arr.length; i++) {
            if (NumberTracker.containsKey(arr[i])) {
                NumberTracker.put(arr[i], NumberTracker.get(arr[i]) + 1);
            } else {
                NumberTracker.put(arr[i], 1);
            }
        }

        // Remove the most common elements until the array is half the size
        int removedElements = 0;

        while (currentLength > goalLength) {
            int mostCommonNumber = 0;
            int mostCommonNumberOccurances = 0;
            for (int key : NumberTracker.keySet()) {
                if (NumberTracker.get(key) > mostCommonNumberOccurances) {
                    mostCommonNumber = key;
                    mostCommonNumberOccurances = NumberTracker.get(key);
                }
            }
            currentLength -= mostCommonNumberOccurances;
            NumberTracker.remove(mostCommonNumber);
            removedElements++;
        }

        return removedElements;

    }
}