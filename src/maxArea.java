public class maxArea {

    public static void main(String[] args){
        int[] test = {1,1};

        System.out.println(maxArea(test));
    }
    public static int maxArea(int[] height) {
        // Max Area
        int maxArea = 0;
        // Distance between the bars
        int distance = 0;
        // Height of left bar
        int leftHeight = 0;
        // Height of right bar
        int rightHeight = 0;
        // Tank Height
        int tankHeight = 0;

        for(int i = 0; i < height.length; i++){
            for(int j = i+1; j < height.length; j++){
                distance = j - i;
                leftHeight = height[i];
                rightHeight = height[j];

                if(leftHeight > rightHeight){
                    tankHeight = rightHeight;
                }else{
                    tankHeight = leftHeight;
                }
                int tempArea = tankHeight * distance;

                if(tempArea > maxArea){
                    maxArea = tempArea;
                }
            }
        }
        return maxArea;

    }
}

// BRUTE FORCE FAIL
