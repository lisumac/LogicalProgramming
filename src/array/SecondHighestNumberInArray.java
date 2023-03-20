package array;

public class SecondHighestNumberInArray {
    static int getNumber(int[] nums) {
        int temp;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] >nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        return nums[n - 2];
    }

    public static void main(String[] args) {


        int[] nums = new int[]{10,56, 11, 90,66};
        //ascending order sort

        System.out.println(getNumber(nums));

    }
}
