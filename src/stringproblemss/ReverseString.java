package stringproblemss;

public class ReverseString {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char tempChar = s[start];
            s[start] = s[end];
            s[end] = tempChar;
            start++;
            end--;
        }
        System.out.println(s);

    }

    public static void reverseWord(String str) {
        char[]string = str.toCharArray();
        /*String test ="";
        for (int i = string.length -1; i >=0; i--) {
            // System.out.print(string[i]);
            test = test+ string[i];
            //System.out.print(test);

        }*/

        int start = 0;
        int end = string.length - 1;
        while (start < end) {
            char tempChar = string[start];
            string[start] = string[end];
            string[end] = tempChar;
            start++;
            end--;
        }
        System.out.println(string);

    }

    public static void main(String[] args) {
        //char[] nums = new char[]{h","e","l","l","o"};
        char[] nums = new char[]{'L', 'i', 's'};
        String lis ="Lisa";
      //  reverseString(nums);
        reverseWord(lis);

    }
}
