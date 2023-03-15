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

        System.out.println(twoSum(nums, target));

    }
}
