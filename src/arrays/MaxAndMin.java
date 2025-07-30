package arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
