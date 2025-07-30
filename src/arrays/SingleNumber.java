package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }
        System.out.println(set);
    }
}
