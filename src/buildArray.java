public class buildArray {
    public static int[] buildArray(int[] nums){
        int[] temp = new int[nums.length];
        for(int i: nums){
            temp[i] = nums[nums[i]];
        }

        return temp;
    }
}
