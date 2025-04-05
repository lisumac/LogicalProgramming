package array;

public class MaxMiFindSum {

    public static int findSum(int A[], int N) {
        //code here
        int sum = 0;
        int min = A[0];
        int max = A[0];
        for (int i = 0; i < A.length; i++) {

            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }

        }

        sum = max + min;
        return sum;


    }


    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -4, 5, 3};
        int length = nums.length;
        System.out.println(findSum(nums, length));

    }
}
