public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }

        }
        System.out.println(count);
        while (count < nums.length)
            nums[count++] = 0;
        System.out.println(nums);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = new int[]{0, 1, 0, 3, 12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);

    }
}
