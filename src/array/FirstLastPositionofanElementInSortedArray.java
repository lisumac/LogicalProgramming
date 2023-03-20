package array;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastPositionofanElementInSortedArray {

    public static void main(String[] args) {
      //  int[] nums = new int[]{0, 0, 1, 1, 2, 2, 2, 2};
        int[] nums = new int[]{0,  1,  2, 4, 4};
        ArrayList<Integer>numss = new ArrayList<>();
        numss.add(0);
        numss.add(1);
        numss.add(2);
        numss.add(4);
        numss.add(4);
        int length = nums.length;
        //int[]  firstLast =new int[]{};
        int[] ans = new int[nums.length];
       // int end =lastOccourancePosition(nums, length, 2);
       // int first = firstOccourancePosition(nums, length, 2);
        System.out.println("occurance:::"+lastOccourancePosition(numss, length, 4));
       /* ans[first] = first;
        ans[end] = end;


        for (int i = 0; i < ans.length; i++) {
            System.out.println("occurance:::FirstLast::::"+ans[i]);
        }*/
        System.out.println(Arrays.toString(new int[]{firstOccourancePosition(numss, length, 2), lastOccourancePosition(numss, length, 2)}));
        return ;



    }

    public static int firstOccourancePosition(ArrayList<Integer> arr, int n, int k) {

        // Write your code here.

        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;
        //firtst
        while (start <=end) {
            if (arr.get(mid) == k) {
                ans = mid;
                end = mid -1;
            } else if (  k> arr.get(mid)) {


                start = mid + 1;
            } else  if (k< arr.get(mid)){
                end = mid -1;

            }
            mid = start + (end - start) / 2;
        }




        return  ans;

    }

    public static int lastOccourancePosition(ArrayList<Integer> arr, int n, int k) {

        // Write your code here.

        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;
        //firtst
        while (start <=end) {
            if (arr.get(mid) == k) {
                ans = mid;
                start = mid + 1;
            } else if (  k> arr.get(mid)) {
                start = mid + 1;
            } else  if (k< arr.get(mid)){
                end = mid -1;

            }
            mid = start + (end - start) / 2;
        }




        return  ans;

    }
}
