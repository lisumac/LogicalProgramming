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

    public static void main(String[] args) {
        //char[] nums = new char[]{h","e","l","l","o"};
        char[] nums = new char[]{'L', 'i', 's'};
        reverseString(nums);

    }
}
