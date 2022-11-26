public class rotateArray {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        method1(nums, k);

    }
    // [1,2,3,4,5,6,7]
    // [1,2,3,4,5,6,0]
    public static void method1(int[] nums, int k) {

        while (k > 0) {
            int overflow = nums[nums.length-1];
            for(int i = nums.length-1; i >0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = overflow;
            k--;
        }
    }
}

