package SAP;
// removing 0s from a array


public class removeZero {
    public static void removal(int arr[]){
        int index = 0;

        for(int i=0 ; i<arr.length; i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        removal(arr);
}
}
