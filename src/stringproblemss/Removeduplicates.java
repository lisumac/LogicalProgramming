package stringproblemss;

import java.util.HashSet;

public class Removeduplicates {
    /*static String removeDuplicates(String str) {
        // code here
        char[] tempCharArry = str.toCharArray();
        int start =0;
        int end = tempCharArry.length -1;
        HashSet<Character> characterHashSet = new HashSet<>();
        while (start< end){
            if (characterHashSet.)
        }

    }*/

    public static void main(String[] args) {
        String lis = "geeksforgeeks";
        //removeDuplicates(lis);

        System.out.println("Hello, World!");

        int [] nums = new int []{5, 2, 8, 7, 1};

        int temp =0;
        for(int i =0; i< nums.length; i++){

            for ( int j = i+1; j < nums.length; j++){


                if(nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }


            }

        }


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
