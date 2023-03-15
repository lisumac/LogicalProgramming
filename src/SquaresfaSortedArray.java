import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays.*;

import static java.util.Arrays.sort;

public  class SquaresfaSortedArray {

    public static int[] sortedSquares(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = 0;
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }


        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];

            //System.out.println(nums[i]);
        }
        return nums;
    }

    public static void main(String[] args) {

//[1,3,5,6], target = 5
        int[] nums = new int[]{10, 8, 5, 6};


        System.out.println(sortedSquares(nums));

    }
}
