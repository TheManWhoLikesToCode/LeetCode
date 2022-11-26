public class firstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(214748364));
    }

    public static int firstBadVersion(int n) {
        int low = 0;
        int mid = 0;
        int high = n;

        while (high >= low) {
            // Why
            mid = low+(high-low)/ 2;
            if (isBadVersion(mid)) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return low;

    }

    private static boolean isBadVersion(int mid) {
        return false;
    }
}