//  Find the First Non-Repeating Character
// Problem Statement:
// Given a string str, find the first character that occurs exactly once in the string.
// If every character is repeated, return -1.
// Example 1:
// Input:  "swiss"
// Output: "w"

package SAP;
import java.util.HashMap;

public class FirstNonRepeating {
    public static char fnr(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else
                map.put(ch,1);
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.get(ch)==1)
                return ch;
        }
        
        return '-';
    }

    public static void main(String[] args) {
        String str = "swiss";
        System.out.println(fnr(str));
    }
}
