package stringproblemss;

public class MissingNumber {


    public static void main (String[]args){


        int[] arr = { 1, 2, 4, 5, 6 };
        System.out.println(missingNumber(arr, arr.length));

    }

    private static int missingNumber(int array[], int n) {
        // Your Code Here
          System.out.println("length "+n);
        int sum1=((n)*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i<n;i++)
            sum2+=array[i];
        return sum1-sum2;
    }
}
