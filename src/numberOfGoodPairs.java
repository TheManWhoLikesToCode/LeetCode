import java.util.HashMap;


// Notes store value at the key and the number of times repeated at value
public class numberOfGoodPairs {

    public static void main(String[] args){
        int[] test = {1,1,1,3,4,8};
        System.out.print(numIdenticalPairs(test));
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        int count = 0, repeat = 0;

        for(int i:nums){
            repeat = map.getOrDefault(i, 0);
            count += repeat;
            map.put(i, repeat+1);

        }

        return count;
    }
}
