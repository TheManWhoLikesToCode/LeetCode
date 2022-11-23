public class firstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersionX(214748364, 214748364));
    }

    public static int firstBadVersionX(int n, int target) {

        int left = 0;
        int right = n;
        int fourth = Math.floorDiv(n, 10);
        int[] fourthArray = new int[9];

        for (int i = 0; i < fourthArray.length; i++) {
            fourthArray[i] =+ fourth;
            if (isBadVersion(i, target)) {
                right = i;
                break;
            }
        }
        
        for (int i = 0; i < fourthArray.length; i++) {
            if (!isBadVersion(i, target)) {
                left = i;
                break;
            }
        }

        int ans = iterativeSolve(n, target, left, right);
        return ans;
    }

    private static int iterativeSolve(int n, int target, int startPoint, int endPoint) {

        int ans = -1;

        for (int i = startPoint; i < endPoint+1; i++) {
            if (isBadVersion(i, target)) {
                ans = i;
                return i;
            }
        }

        return ans;
    }

    private static boolean isBadVersion(int middle, int target) {

        if (middle == target) {
            return true;
        }

        return false;
    }
}