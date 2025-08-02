package arrays;

import java.util.HashSet;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : arr1){
            if(set1.contains(num)){
                System.out.println(num);
            }
            set1.add(num);
        }
        for(int num : arr2){
            if(set2.contains(num)){
                System.out.println(num);
            }
            set2.add(num);
        }
        System.out.println(set1);
        System.out.println(set2);
    }
}
