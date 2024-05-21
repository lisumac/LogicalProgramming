package array;

public class SmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {

        int l = 0;
        int r = letters.length;

        while (l < r) {
            final int m = (l + r) / 2;
            if (letters[m] > target)
                r = m;
            else
                l = m + 1;
        }

        return letters[l % letters.length];

    }

    public static void main(String[] args) {
        char[] strs = new char[]{'c', 'f', 'j'};
        char target ='c';
System.out.println("length"+strs.length);
        System.out.println(nextGreatestLetter(strs,target ));

    }
}
