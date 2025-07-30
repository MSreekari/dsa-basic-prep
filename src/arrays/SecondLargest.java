package arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                secondMax = max;
                max = nums[i];
            }else if(nums[i] > secondMax && nums[i] < max){
                secondMax = nums[i];
            }
        }
        System.out.println(secondMax);
    }
}
