package stringproblemss;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class ReverseWords {


    public static String reverseWords(String s) {


        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return String.join(" ", arr);


    }

    public static String reverseWord(String str) {
        char[]string = str.toCharArray();
        String test ="";
        for (int i = string.length -1; i >=0; i--) {
           // System.out.print(string[i]);
             test = test+ string[i];
            //System.out.print(test);

        }
        return  test;
    }

    static String reverseSentence(String str) {

        Pattern pattern = Pattern.compile("\\s");
        System.out.println("patten" + pattern);
        String[] temp = pattern.split(str);
        System.out.println("tem" + temp);
        String result = "";

        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }

    static String reverseStringWithDot(String S) {


        ArrayList<Integer> dotss = new ArrayList<>();
        dotss.add(0);
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                dotss.add(i);
            }

        }
        dotss.add(S.length());
        String ansString = "";
        for (int i = dotss.size() - 2; i > 0; i--) {
            ansString += S.substring(dotss.get(i) + 1, dotss.get(i + 1));
            ansString += ".";

        }
        ansString += S.substring(dotss.get(0), dotss.get(1));
        return ansString;


    }

    public static void main(String[] args) {
        // String word = "Let's take LeetCode contes";
        String sentenec = " I am programmer";
        String sentene = " i.like.this.program.very.much";
        String word = "Lisa";
        String worddd = "Ninjas Coding to Welcome";
        //System.out.println(reverseWords(word));
          System.out.println("Sentence::::"+reverseSentence(worddd));
        //System.out.println("Sentence::::" + reverseStringWithDot(sentene));
        //System.out.println("Sentence::::" + reverseWord(worddd));
        /*String input = "Geeks";
        char[] try1 = input.toCharArray();
        for (int i = try1.length-1;i >= 0; i--)
            System.out.print(try1[i]);*/

    }
}
