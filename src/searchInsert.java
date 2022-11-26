public class searchInsert {

    public static void main(String[] args){
        int[] test = {1,3};
        int target = 2;

        System.out.println(searchInsert(test, target));

    }

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int mid = 0;
        int end = nums.length;

        while(end > start){
            mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return mid;

    }
}
