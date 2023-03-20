package stringproblemss;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static HashSet<Character> lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        HashSet<Character> characters = new HashSet<>();
        while (end < s.length()) {
            if (!characters.contains(s.charAt(end))) {
                characters.add(s.charAt(end));
                end++;
                max = Math.max(characters.size(), max);
            } else {
                characters.remove(s.charAt(start));
                start++;
            }

        }
        return characters;

    }

        public static void main (String[]args){


            String s = "abcabcbb";
            System.out.println(lengthOfLongestSubstring(s));

        }
    }
