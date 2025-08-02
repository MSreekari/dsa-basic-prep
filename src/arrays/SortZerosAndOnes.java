package arrays;

import java.util.Arrays;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count++;
            }
        }
        System.out.println(count);
        int slow = 0;
        for(int fast = 0; fast < arr.length; fast++){
            if(arr[fast] == 0){
                arr[slow] = arr[fast];
                slow++;
            }
        }
        for (int i = slow; i < arr.length; i++) {
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
