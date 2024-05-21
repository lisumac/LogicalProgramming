package array;

import java.util.Arrays;

public class RotateArray {



    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int j, last;
            last = nums[nums.length - 1];
            for (j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            //Last element of array will be added to the start of array.
            nums[0] = last;

        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
//[1,3,5,6], target = 5
        int[] nums = new int[]{10, 11, 5, 6};
        int[] rotatenums = new int[]{7, 5 ,2, 11 ,2, 43, 1, 1};
        int n = 8;

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, 2);

    }
}
