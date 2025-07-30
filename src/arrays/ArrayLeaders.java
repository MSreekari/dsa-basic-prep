package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        list.add(maxFromRight);
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] >= maxFromRight){
                maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
