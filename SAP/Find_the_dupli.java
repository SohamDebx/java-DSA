package SAP;
import java.util.HashSet;

// Q1. Find the Duplicate
// Problem:
// You are given an array of n + 1 integers where every integer is in the range [1, n].
// There is exactly one duplicate number. Find the duplicate.

public class Find_the_dupli {
    public static int dupli(int[] num){
        HashSet<Integer> set= new HashSet<>();

        for(int i : num){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {1,2,2,4,5,6};
        System.out.println(dupli(num));
    }
}
