import java.util.Arrays;

public class Main {
    public static int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int temp = 0;
        int[] ans = new int[nums.length];



        for (int i = 0; i < nums.length; i++)
            nums[i] = nums[i] * nums[i];
        Arrays.sort(nums);

       return  nums;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
//[1,3,5,6], target = 5
        int[] nums = new int[]{10, 11, 5, 6};
        System.out.println(sortedSquares(nums));


    }
}