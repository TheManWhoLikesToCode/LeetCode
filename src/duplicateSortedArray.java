public class duplicateSortedArray {

    public static void main(String[] args){
        int[] test = {0,0,1,1,1,2,2,3,3,4};
        int x = removeDuplicates(test);
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {



        int count = 0;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = 111;
            }
        }


        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){

                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 111){
                count++;
            }
        }
        return count;
    }
}
