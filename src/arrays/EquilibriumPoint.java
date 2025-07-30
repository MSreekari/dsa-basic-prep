package arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 3};
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int leftSum = 0;
        int rightSum;
        for(int i = 0; i < nums.length; i++){
            rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum){
                System.out.println("Equilibrium Point");
            }
            leftSum = leftSum + nums[i];
        }
    }
}
