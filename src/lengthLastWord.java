public class lengthLastWord {

    public static void main(String[] args){

        int x = lengthOfLastWord("s");
        System.out.print(x);
    }


    public static int lengthOfLastWord(String s) {

        char[] arrayS = new char[s.length()];
        int lastChar = 0;
        int firstChar = 0;
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            arrayS[i] = s.charAt(i);

            if(s.charAt(i) != ' '){
                lastChar = i;
            }
        }

        for(int i = lastChar; i > 0; i--){
            if(s.charAt(i) == ' '){
                firstChar = i;
                break;
            }
        }

        if(firstChar == 0 && lastChar == 0){
            return s.length();
        }

        return (lastChar - firstChar);



    }
}
// FAILED!