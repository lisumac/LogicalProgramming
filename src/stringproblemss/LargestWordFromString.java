package stringproblemss;

public class LargestWordFromString {

    static String longestWord(String str) {

        String[] arr = str.split(" ");

        int maxlength, minlength;
        maxlength = Integer.MIN_VALUE;
        minlength = Integer.MAX_VALUE;
        String largest, smallest;
        largest = smallest = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < minlength) {
                smallest = arr[i];
                minlength = arr[i].length();
            }
            if (arr[i].length() > maxlength) {
                largest = arr[i];
                maxlength = arr[i].length();
            }
        }
        System.out.println("The largest and smallest word is \"" + largest +
                "\" and \"" + smallest + "\"");
        return largest;
    }
    public static String LongestWord(String str){
        String[] words = str.split(" ");
       int index = 0;
        for (int i = 0; i < words.length; ++i) {
            final String currentWord = words[i];
            if (currentWord.length() > words.length){
                index = i;
            }

        }
        return words[index];
    }

    public static void main(String[] args) {


        String s = "Mohapatra I am  AndroidDeveloper Lisa Das ";
        //System.out.println(longestWord(s));
        System.out.println("LargestWord:::::>>>>"+LongestWord(s));

    }
}
