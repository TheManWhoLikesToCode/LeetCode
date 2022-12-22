public class reverseWordsThree {

    public String reverseWords(String s) {

        // Split the string into words
        String[] words = s.split(" ");
        String ans = "";

        int remainingWords = words.length;
        int i = 0;

        while (remainingWords > 0) {
            String currWord = words[i];
            String reverseWord = "";
            for (int j = currWord.length(); j > 0; j--) {
                reverseWord += currWord.charAt(j);
            }
            words[i] = reverseWord;
        }

        // Concatenate the reversed words and return the result
        for (String word : words) {
            ans += word + " ";
        }
        return ans.trim();
    }
}