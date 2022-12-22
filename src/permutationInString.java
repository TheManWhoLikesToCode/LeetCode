import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";

        System.out.println(checkInclusion(s1, s2));


    }


    public static boolean checkInclusion(String s1, String s2) {
       // Convert the strings to arrays of characters
       char[] s1ca = s1.toCharArray();
       char[] s2ca = s2.toCharArray();
   
       // Create a hash map to store the frequency of each character in s1
       Map<Character, Integer> s1CharMap = new HashMap<>();
       for (char c : s1ca) {
           s1CharMap.put(c, s1CharMap.getOrDefault(c, 0) + 1);
       }
   
       // Create a hash map to store the frequency of each character in the current window
       Map<Character, Integer> windowCharMap = new HashMap<>();
   
       // Slide the window over s2, checking if the current window is a permutation of s1
       for (int i = 0; i < s2.length(); i++) {
           // Add the character at the right of the window
           char rightChar = s2ca[i];
           windowCharMap.put(rightChar, windowCharMap.getOrDefault(rightChar, 0) + 1);
   
           // If the window is larger than s1, remove the character at the left
           if (i >= s1.length()) {
               char leftChar = s2ca[i - s1.length()];
               windowCharMap.put(leftChar, windowCharMap.get(leftChar) - 1);
               if (windowCharMap.get(leftChar) == 0) {
                   windowCharMap.remove(leftChar);
               }
           }
   
           // If the window is the same size as s1, check if it is a permutation
           if (i >= s1.length() - 1 && windowCharMap.equals(s1CharMap)) {
               return true;
           }
       }
   
       return false;
   }
    
   
   }