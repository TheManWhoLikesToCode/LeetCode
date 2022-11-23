public class palindromeNumber {

    public static void main(String[] args) {
        System.out.print(isPalindrome(1234));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int original = x;

        while (original > 0) {
            reverse = (original % 10) + (reverse * 10);
            original /= 10;
        }

        return reverse == x;

    }
}
