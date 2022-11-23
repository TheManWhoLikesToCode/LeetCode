public class BinarySearch {

    public static void main(String[] args) {
        int[] test = {-1, 0, 5};
        int target = 5;

        System.out.println(search(test, target));
    }

    public static int search(int[] nums, int target) {

        // Create a middle point
        int middleIndex = Math.round(nums.length / 2);
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        char leftOrRight = 'l';
        boolean isFound = false;


        // Until left and right index = each other continue

        while (!isFound) {

            if (rightIndex - leftIndex == 1) {
                if (nums[leftIndex] == target) {
                    return leftIndex;
                } else if (nums[rightIndex] == target) {
                    return rightIndex;
                }

            }

            // Look at middle point and if it equals target return
            if (nums[middleIndex] == target) {
                isFound = true;
                return middleIndex;
            }

            if (rightIndex - leftIndex <= 1) {
                isFound = false;
                break;
            }
            // If it doesn't compare nums at middle to target if it's less than target set middle index as start of the array
            if (target < nums[middleIndex]) {
                leftOrRight = 'l';
            } else if (target > nums[middleIndex]) {
                leftOrRight = 'r';
            }

            switch (leftOrRight) {

                case 'l':
                    rightIndex = middleIndex;
                    break;

                case 'r':
                    leftIndex = middleIndex;
                    break;
            }


            middleIndex = (rightIndex + leftIndex) / 2;

        }

        if (isFound)
            return middleIndex;
        else {
            return -1;
        }
    }
}



