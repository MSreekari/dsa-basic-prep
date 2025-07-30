package arrays;

import java.util.Arrays;

public class SortedArray {
    public static boolean checkSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void sort(int[] arr){
        int slow = 0;
        for (int fast = 0; fast < arr.length - 1; fast++) {
            if(arr[fast] < arr[fast + 1]){
                arr[slow] = arr[fast];
                slow++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(checkSorted(nums));
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
