import java.util.HashMap;
import java.util.List;

public class threeSum {

    public List<List<Integer>> method(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int complement;
        for (int i : nums) {
            complement = nums[i] * -1;
            map.put(i, complement);
        }


    }
}
