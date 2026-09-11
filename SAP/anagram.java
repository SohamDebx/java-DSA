package SAP;
// Q7. Check Whether Two Strings Are Anagrams 
// Problem Statement:
// Given two strings str1 and str2, determine whether they are anagrams of each other.
// Two strings are anagrams if they contain the same characters with the same frequencies, regardless of their order.

import java.util.HashMap;

public class anagram {
    public static boolean ana(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

    for(int i=0; i<str1.length();i++){
        char ch = str1.charAt(i);

        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
    }

    for(int i=0; i<str2.length(); i++){
        char ch = str2.charAt(i);

        if(!map.containsKey(ch)){
            return false;
        }
        map.put(ch,map.get(ch)-1);
    }

    for(char i : map.keySet()){
        if(map.get(i)!=0)
            return false;
        else
            return true;
    }

    return false;

    }

    public static void main(String[] args) {
        String str1= "race";
        String str2= "care";

        System.out.println(ana(str1, str2));
    }

}
