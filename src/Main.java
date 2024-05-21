import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int temp = 0;
        int[] ans = new int[nums.length];


        for (int i = 0; i < nums.length; i++)
            nums[i] = nums[i] * nums[i];
        Arrays.sort(nums);

        return nums;
    }

    public static String reverseString(String str) {
        //Write your code here

        String[] arr = str.split(" ");
        String test ="";
        for (int i = arr.length -1; i >=0; i--) {
            // System.out.print(string[i]);
            test += arr[i] +" ";
            //System.out.print(test);

        }


      return  test.substring(0, test.length() - 1);

    }


        // Write your code here

        public static ArrayList<Integer> primeNumbersTillN(int N)
        {

            // Write your code here
            ArrayList<Integer> primeNumbers = new ArrayList<>();
            int i, count;
            for (int j = 2; j <= N; j++) {
                count = 0;
                for (i = 1; i <= j; i++) {
                    if (j % i == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    primeNumbers.add(j);
                }

            }

            return primeNumbers;

    }


    public static void rotate(int[] nums, int k)
    {
        ArrayList<Integer> number = new ArrayList<>();

        int r = k % nums.length;


        swapelement(nums,0,  nums.length-1);
        swapelement(nums,0 , k-1);
        swapelement(nums, r, k-1);




    }

    private static void swapelement(int[] nums,int start,  int end) {
        ArrayList<Integer> number = new ArrayList<>();
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
           number.add(nums[start] );
        }

        System.out.println(":::"+nums);


        for (int i = 0; i < nums.length; i++) {
            System.out.println("::LL:"+nums[i]);
        }


    }

    public static void main(String[] args) {

//[1,3,5,6], target = 5
        int[] nums = new int[]{10, 11, 5, 6};
        int[] rotatenums = new int[]{7, 5 ,2, 11 ,2, 43, 1, 1};
        int n = 8;
        //System.out.println(sortedSquares(nums));
        String str = "Welcome   to Coding Ninjas";
        rotate(rotatenums,n);

        //System.out.println("   >>> ::::" + reverseString(str));
       // System.out.println("oo::" + primeNumbersTillN(7));





    }
}