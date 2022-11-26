import java.util.LinkedList;

public class moveZeros {
    public void sol(int[] nums) {

        LinkedList ans = new LinkedList();
        if(nums.length == 0){
            return;
        }

        for(int i: nums){
            if(nums[i] != 0){
                ans.add(nums[i]);
            }
        }
        ans.toArray();


    }
}
