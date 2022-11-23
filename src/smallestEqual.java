public class smallestEqual {

    public static int method(int[] nums){

        for(int i = 0; i < nums.length; i++){
            if(i%10 == nums[i]){
                return i;
            }
        }

        return -1;
    }
}
