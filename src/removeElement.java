public class removeElement {

    public static void main(String[] args){
        int[] test = {1,7,3,4,5,6,7,7,7};
        int target = 7;

        int ans = removeElement(test, target);
    }

    public static int removeElement(int[] nums, int val) {

        int count = 0;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == val){
                nums[i] = 51;
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

