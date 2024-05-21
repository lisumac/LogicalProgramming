package array;

import java.util.Objects;

public class BinarySearch {

    public static int search(int[] nums, int target) {
      int start = 0;
      int end = nums.length-1;
      int mid = start + (end - start)/2;
      while (start<=end){
          if ( nums[mid]== target){
              return  mid;

          }
          if (target> nums[mid]){
              start = mid+1;
          }else {
              end = mid -1;
          }
          mid =start + (end - start)/2;
      }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
//[1,3,5,6], target = 5
        int[] nums = new int[]{1,3,5,6};
        int target = 7;
        System.out.println(search(nums, target));


    }
}
