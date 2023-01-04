import java.util.HashMap;
import java.util.Map;

public class temp {

    public int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> complement = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int complementINT = target - nums[i];

            if(complement.containsKey(complementINT)){
                return new int[] {i, complement.get(complementINT)};
                }
            complement.put(complementINT, i);

        }

        return null;
        }
    }

