public class plusOne {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6};
        plusOne(test);
    }

    public static int[] plusOne(int[] digits) {

        int orginal = 0;
        int[] originalArray = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            orginal = (orginal * 10) + (digits[i]);
        }

        orginal++;

        String temp = Integer.toString(orginal);

        for (int i = 0; i < digits.length; i++) {
            originalArray[i] = temp.charAt(i) - '0';
        }

        return originalArray;
    }
}
