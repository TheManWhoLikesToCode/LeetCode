import java.util.HashMap;
import java.util.Map;

public class checkInclusion {

    public boolean method1(String s1, String s2){

        char[] s1ca = s1.toCharArray();
        char[] s2ca = s2.toCharArray();


        // Window size s1 length;
        int left = 0;
        int right = s1.length()-1 + left;

        while(right < s2.length()-1){
            for(int i = left; i < right; i++){

            }

            left++;
        }

        return false;

    }
}
