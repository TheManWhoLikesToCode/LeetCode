import java.util.Arrays;
import java.util.LinkedList;

public class meregeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.print("Done");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] merged = Arrays.copyOf(nums1, m+n);
        int k = 0;

        for(int i = m; i < n+m; i++){
            merged[i] = nums2[k];
            k++;
        }



        for(int i = 0; i < merged.length; i++){
            for(int j = i+1; j < merged.length; j++){
                if(merged[i] > merged[j]){
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        nums1 = merged;
        nums2 = merged;


    }

}

