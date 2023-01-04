import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class singleNumber {

    public int method(int[] nums){

        HashMap<Integer, Integer> numsHash = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            // For each element in the array put it in a hash map
            if(!numsHash.containsKey(nums[i])){
                numsHash.put(nums[i], 1);
            }else{
                int temp = numsHash.get(nums[i]) + 1;
                numsHash.put(nums[i], temp);
            }
        }


    }
}
