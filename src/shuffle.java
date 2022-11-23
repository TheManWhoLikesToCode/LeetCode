import java.util.Arrays;
import java.util.HashMap;

public class shuffle {

    public static void main(String[] args){
        int[] temp = {2,5,1,3,4,7};
        int target = 3;
        int[] x = shuffle(temp,target);
    }
    public static int[] shuffle(int[] nums, int n) {

        int temp[];
        temp = Arrays.copyOf(nums, nums.length);

        // add odds
        for (int i = 0; i < n; i++) {
            temp[i*2+1] = nums[i];
        }

        for (int i = 1; i < n; i++) {
            temp[i*2] = nums[i];
        }
        return nums;
    }
}


//Failed
