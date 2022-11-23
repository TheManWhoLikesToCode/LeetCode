import java.util.HashMap;

public class twoSum {

    public static void main(String[] args) {
        int[] test = {0, 1, 2, 3, 4};
        int target = 5;

        int[] ans = sol(test, target);
        System.out.println();
    }

    public static int[] sol(int[] nums, int target) {
        // Complement then index
        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // If nums[i] complement exists set it equal to complementIndex
            Integer complementIndex = complements.get(nums[i]);

            if (complementIndex != null) {
                return new int[] {complementIndex, i};
            }

            // else
            complements.put((target-nums[i]), i);

        }

        return nums;


    }
}