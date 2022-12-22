public class numJewlsInStones {

    public int numJewelsInStones(String jewels, String stones) {

        char[] jewlsChar = new char[jewels.length()];
        int count = 0;

        for(int i = 0; i < jewels.length();i ++){
            jewlsChar[i] = jewels.charAt(i);
        }

        for(int i = 0; i < jewlsChar.length; i++){
            for(int j = 0; j < stones.length(); i++){
                if(jewlsChar[i] == stones.charAt(j)){
                    count++;
                }
            }
        }

        return count;
    }
}
