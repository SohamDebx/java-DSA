package SAP;
import java.util.HashSet;
// Q12. Longest Substring Without Repeating Characters 
// Problem Statement:
// Given a string str, find the length of the longest substring that contains no repeating characters.
// A substring must contain consecutive characters.

// Example 1:
// Input:  "abcabcbb"
// Output: 3

// Explanation:
// "abc" → length 3
// The next character a repeats, so "abca" is invalid.
public class Longest_substr_without_rep {
    public static int l_substr(String str){
        int left=0;
        int max=0;
        
        HashSet<Character> set = new HashSet<>();

        for(int right = 0 ; right<str.length(); right ++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if(right-left+1>max)
                max = right-left+1;
     
        }

        return max;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(l_substr(str));
    }
}


