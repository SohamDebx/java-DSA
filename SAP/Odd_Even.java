package SAP;

// Q3. Separate Odd and Even Numbers
// Given an integer array, rearrange the elements such that all odd numbers appear before all even numbers.

public class Odd_Even {
    public static int oddandeve(int[] arr){
        int left=0;
        int right=arr.length-1;
        
        while(left<right){
            if(left<right && arr[left]%2!=0)
            {
                left++;
            }
            else if(left<right && arr[right]%2==0)
            {
                right--;
            }

            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr= {1,2,3,4,5,6};
        oddandeve(arr);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
