package arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int currmax = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currmax++;
            }else{
                currmax = 0;
            }
            if(currmax > max){
                max = currmax;
            }
        }
        System.out.println(currmax);
    }
}
