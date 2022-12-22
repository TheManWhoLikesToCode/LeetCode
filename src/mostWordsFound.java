public class mostWordsFound {

    public static void main(String[] args) {
        String[] testcase = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
        System.out.print(method1(testcase));
    }

    public static int method1(String[] sentences) {

        int sentenceCounter = sentences.length;
        int currentMax = Integer.MIN_VALUE;
        int index = 0;

        while(sentenceCounter > 0){
            String currentSentence = sentences[index];
            String[] temp = currentSentence.split(" ");
            if(currentMax < temp.length){
                currentMax = temp.length;
            }
            sentenceCounter--;
            index++;
        }

        return currentMax;

    }
}