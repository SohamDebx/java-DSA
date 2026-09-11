package SAP;

// Second Highest element in a array

public class secondHighest {
    public static void sechigh(int[] arr){
        int max=0 ,sec_max= 0;

        for(int i=0 ; i< arr.length; i++){
            if(arr[i] > max){
                sec_max = max;
                max = arr[i];
            }
            else if(arr[i]>sec_max && arr[i]!=max){
                sec_max = arr[i];
            }
        }

        System.out.print("Second Highest: "+sec_max);
    }

    public static void main(String[] args) {
        int[] arr= {10,12,8,6,14,24};
        sechigh(arr);
    }
}
