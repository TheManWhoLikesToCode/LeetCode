import java.util.HashMap;

public class lengthOfLongestSubstring {

    public static int method1(String s){

        HashMap<Character, Integer> h = new HashMap();
        int maxLength = 0;

        for(int left = 0, right = 0; right < s.length()-1; right++){

            if(h.containsKey(s.charAt(right)) && h.get(s.charAt(right)) >= left){
                left = h.get(s.charAt(right)) + 1;
            }

            maxLength = Math.max(maxLength, right-left+1);
            h.put(s.charAt(right), right);
        }

        return maxLength;
    }
    
}
