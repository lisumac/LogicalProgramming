package array;

public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {

        int i = 0; // nums1's index
        int j = 0; // nums2's index
        while (i < nums1.length && j < nums1.length) {
            if (nums1[i] == nums2[j])
                return nums1[i];
            if (nums1[i] < nums2[j])
                ++i;
            else
                ++j;
        }

        return -1;
    }



    public static void main(String[] args) {

        //int[] nums1 = { 1,2,3 };
        int[] nums1 = { 2 };
        int[] nums2 = { 1,2 };
        //int[] nums2 = { 2,4 };


        System.out.println("number"+getCommon(nums1, nums2));

    }
}
