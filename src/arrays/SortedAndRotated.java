package arrays;

public class SortedAndRotated {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]){
                count++;
            }
        }
        if(count <= 1){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
    }
}
