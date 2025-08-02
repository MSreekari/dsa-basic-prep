package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums2){
            if(set.contains(num)){
                set2.add(num);
            }
        }
        int[] result = new int[set2.size()];
        int i = 0;
        for(int num : set2){
            result[i++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
}
