package array;

import java.util.ArrayList;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
       // arr.get(start);

        while (start < end) {
            int mid = start+(end-start)/2;
            if (nums[mid]<nums[mid+1]){
                start =mid+1;
            }else {
                end = mid;
            }
        }
        return  start;
    }

    public static void main(String[] args) {
        //int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
       // int[] nums = new int[]{1,2,3,2,1};
        int[] nums = new int[]{2 ,3 ,4, 1, -4};
        System.out.println(findPeakElement(nums));
    }
}
