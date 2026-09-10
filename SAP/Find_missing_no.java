package SAP;
import java.util.HashSet;
// Q2. Find the Missing Number
// Given an array containing n distinct numbers taken from the range 0 to n, find the missing number.

public class Find_missing_no {
    public static int miss(int[] arr,int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        for(int i=0;i<=n;i++){
            if(!set.contains(i))
            {
                System.out.println(i);
            }
        }
        return -1;
    }


    // alt approach for single missing number

    public static int single_miss(int[] arr){
        int n= arr.length;
        int actual_val=0;
        for(int i:arr){
            actual_val+=i;
        }

        int expected_val= n*(n+1)/2;
        return(expected_val-actual_val);

    }

    public static void main(String args[]){
        int[] arr={4,0,1};
        int n= arr.length;
        miss(arr,n);

        int[] arr1={3,0,1};
        System.out.println(single_miss(arr1));
    }
}



