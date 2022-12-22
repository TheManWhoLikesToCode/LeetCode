public class shuffleString {
    public String restoreString(String s, int[] indices) {

        int remainingNumbers = s.length();
        int searchNumber = 0;
        String ans = "";

        while (remainingNumbers > 0) {

            // Look for indices at searchNumber
            for (int i = 0; i < s.length(); i++) {
                if (searchNumber == indices[i]) {
                    ans += s.charAt(i);
                    searchNumber++;
                    remainingNumbers--;
                }
            }

        }

        return ans;
    }
}
