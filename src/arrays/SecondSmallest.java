package arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};
        int min = Integer.MAX_VALUE;
        int secondMin =  Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                secondMin = min;
                min = nums[i];
            }else if(nums[i] > secondMin && nums[i] < min){
                secondMin = nums[i];
            }
        }
        System.out.println(secondMin);
    }
}
