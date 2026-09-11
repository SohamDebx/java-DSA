package SAP;

// Q6. Move Zeroes to the End
// Given an array, move all 0s to the end of the array while maintaining the relative order of the non-zero elements.
// Input:  [0, 1, 0, 3, 12]
// Output: [1, 3, 12, 0, 0]

class move_zerotoend{
    public static void move(int[] arr){
        int index = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }

        while(index < arr.length){
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr= {0, 1, 0, 3, 12};
        move(arr);
        for(int i : arr)
            System.out.print(i+" ");
    }
}