public class Interpret {

    public String method1(String command) {
        String ans = "";

        for (int i = 0; i < command.length() - 1; i++) {
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                ans += 'o';
                i++;
            } else if (command.charAt(i) == '(' || command.charAt(i) == ')') {

            } else {
                ans += command.charAt(i);
            }
        }
        return ans;
    }
}
