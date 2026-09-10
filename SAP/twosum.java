package SAP;
import java.util.HashMap;

public class twosum {
    public static int[] ts(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int needed=target-arr[i];

            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(arr[i],i);
        }

        return new int[]{-1,-1};
    }

    public static void main(String args[]){
        int[] arr= {2, 7, 11, 15};
        int target= 9;
        int[] result = ts(arr,target);
        for(int i:result)
            System.out.println(i+" ");
    }
}

