package SAP;
import java.util.HashMap;

public class FreqofElements{
    public static void freq(int[] arr){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i : map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
    }

    public static void main(String args[]){
        int[] arr = {1,2,2,3,1,1};
        freq(arr);
    }
}