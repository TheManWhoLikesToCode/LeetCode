import java.util.ArrayList;

public class createTargetArray {

    public int[] method(int[] nums, int[] index) {

        ArrayList<Integer> ans = new ArrayList<>(nums.length);

        for(int i = 0; i < nums.length; i++){
            ans.add(index[i], nums[i]);
        }

        // Turn this into a int array
        //int[] arrayAns = ans.toArray(new int[ans.size()]);

        return new int[] {};
    }
}
