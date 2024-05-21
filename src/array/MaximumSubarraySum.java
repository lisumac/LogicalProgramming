package array;

import static java.lang.Math.max;

public class MaximumSubarraySum {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i <= n -1; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public  static int maxSubArray(int[] nums) {

        int sum = 0;
        int maxi= nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxi = max(maxi, sum);


            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        int number = 15;
        //  int[] numsg = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10};
        int[] numsg = {-2,1,-3,4,-1,2,1,-5,4};

        //System.out.println(maxSubarraySum(numsg, number));
        System.out.println(maxSubArray(numsg));


    }


}
