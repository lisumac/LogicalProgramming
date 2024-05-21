package array;

import java.util.ArrayList;

public class CutArray {
    static int cutArray(int n, int []a) {
        // Write your code here.
        int[] newList = new int[]{a.length};

        for (int i = 0; i < n; i++) {
            System.out.println(("hhhh"+a[i]));
            if (n==a[i]){
                newList[0] = a[i];
                System.out.println((a[i]));
            }

        }
        return 0;
    }
    public static void main(String[] args) {

        // int[] nums = new int[]{1,2,3,2,1};
        int[] nums = new int[]{2 ,5,3};
        int n = nums.length;
        System.out.println(cutArray(n,nums));
    }
}
