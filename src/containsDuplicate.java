import java.util.ArrayList;

public class containsDuplicate {

    public boolean containsDuplicate(int[] nums){
        ArrayList<Integer> numsA = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(!numsA.contains(nums[i])){
                numsA.add(nums[i]);
            }else{
                return false
            }
        }

        return true;
    }
}
