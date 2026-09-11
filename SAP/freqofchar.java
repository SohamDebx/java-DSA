package SAP;
import java.util.HashMap;

class freqofchar{
    public static void freq(String str){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,(map.get(ch))+1);
            }
            else
                map.put(ch,1);
        }

        for(char i: map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
    }

    public static void main(String[] args) {
        String str = "banana";
        freq(str);
    }
}



















// public class freqofchar {
//     public static void freq(String str){
//         StringBuilder sb = new StringBuilder();
//         HashMap<Character,Integer> map= new HashMap<>();

//         for(int i=0;i<str.length();i++){
//             sb.append(str.charAt(i));
//         }

//         for(int i=0; i<sb.length();i++){
//             if(map.containsKey(sb.charAt(i))){
//                 map.put(sb.charAt(i),map.get(sb.charAt(i))+1);
//             }
//             else
//                 map.put(sb.charAt(i),1);
//         }
//         for(char i : map.keySet())
//             System.out.println(i+" "+map.get(i));
//     }
//     public static void main(String[] args) {
//     String str = "banana";
//     freq(str);
// }
// }
