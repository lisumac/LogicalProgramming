package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndices {


    public static  List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);

        ArrayList<Integer> indices = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            if(target == nums[i]){
                indices.add(i);
            }
        }
        return indices;
    }
    public List<Integer> targetIndiceBinarySearch(int[] nums, int target) {
        int count = 0, lessthan = 0;
        for (int n : nums) {
            if (n == target) count++;
            if (n < target) lessthan++;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessthan++);
        }
        return result;
    }
    public static void main(String[] args) {


        int[] numsg = { 1,2,5,2,3 };
        int targett = 5;

     System.out.println("number"+targetIndices(numsg, targett));

    }

}
