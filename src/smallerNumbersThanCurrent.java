public class smallerNumbersThanCurrent {

    public int[] method(int[] nums) {

        int[] a = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if(nums[j] < nums[i]){
                    count++;
                }

            }
            a[i] = count;
            count = 0;
        }


        return nums;

    }
}
