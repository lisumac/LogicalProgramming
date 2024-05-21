package array;

import java.util.Scanner;

public class Solution {

    public static void twoSum(int n) {


       // System.out.println("");
        for ( int raw = 0; raw < n; raw++) {
            for ( int column = 0; column < n; column++) {

                if (raw == 0 || raw == n-1 || column ==0 || column ==n-1 ){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }



            }
            System.out.println("");
        }


    }

    public  static  void hollowInvertedPyramid( int n){

       for ( int raw = 0; raw < n; raw++) {
            for ( int column = 0; column < n; column++) {

                if (raw == 0  || column==0 || column== n-raw-1){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }



            }
            System.out.println("");
        }


    }

    public static  void  fullPyramid(int n){
        for ( int raw = 0; raw < n; raw++) {
            for ( int column = 0; column < n; column++) {

                if (raw == n/2 || column==0 || column== n-1){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }



            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {


        hollowInvertedPyramid(7);

        // declare instance of Scanner class
                /*Scanner sc = new Scanner(System.in);
                // declare variables
                int s, i, j;

                // take input
                System.out.print("Enter the length of the side of square: ");
                s = sc.nextInt();

                // new line
                System.out.println("");

                // display the pattern
                for (i = 1; i <= s; i++) {
                    for (j = 1; j <= s; j++) {
                        // print *
                        System.out.print("*");
                    }
                    // new line
                    System.out.println("");
                }
            }*/
    }
}









