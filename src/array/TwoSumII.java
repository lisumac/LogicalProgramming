package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            sum = numbers[start] +numbers[end] ;
            if (sum > target) {
                end --;

            } else if (sum < target) {
                start ++;
            } else {

                return new int[]{start + 1, end + 1};
            }


        }

        return new int[]{start + 1, end + 1};
    }

    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

       // System.out.println(twoSum(nums, target));
        int[] numsg = { 8, 7, 2, 5, 3, 1 };
        int targett = 10;

        findPair(numsg, targett);

    }

    public static void findPair(int[] nums, int target)
    {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // do for each element
        for (int i = 0; i < nums.length; i++)
        {
            // check if pair (nums[i], target-nums[i]) exists

            // if the difference is seen before, print the pair
            if (map.containsKey(target - nums[i]))
            {
                System.out.printf("Pair found (%d, %d)",
                        nums[map.get(target - nums[i])], nums[i]);
                return;
            }

            // store index of the current element in the map
            map.put(nums[i], i);
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
}
