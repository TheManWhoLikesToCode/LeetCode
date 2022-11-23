public class maximumProduct {

    public static int method(int[] nums){

        int temp;
        int currGreatSum = -1000;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    temp = nums[i] * nums[j] * nums[k];
                    if(currGreatSum < temp){
                        currGreatSum = temp;
                    }
                }
            }
        }

        return currGreatSum;
    }
}
// FAILED!