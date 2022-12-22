public class getConcatenation {

    public static int[] getConcatenation(int[] nums){
        int[] t =new int[nums.length*2];
        int s=0;
        for(int i=0; i<nums.length*2; i++){
            if(s >= nums.length){s = 0;}
            t[i] = nums[s]; s++;
        }
        return t;
    }
}
