package array;

import java.util.ArrayList;

public class FindPair {

    static int[] findPair(int x, int y) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        int [] ans = new int[2];
        int sum1 = 0;
        int sum2 = 0;
      //  sum1 = x / 2;
        sum1 = y / 2;
       int sum3 = x -sum1;
        sum2 = x + y;
        /*primeNumbers.add(sum1);
        primeNumbers.add(sum3);*/

        int a = (x + y)/2;

        if(2 * a == (x + y)){

            ans[0] = a;

            ans[1] = x - a;
            primeNumbers.add(a);
            primeNumbers.add(x-a);

        }else {
            ans[0] = -1;

            ans[1] = -1;
            primeNumbers.add(-1);
            primeNumbers.add(-1);
        }
        System.out.println(primeNumbers);

        return ans;
    }

    public static void main(String[] args) {


        System.out.println("number" + findPair(16 ,19));

    }
}
