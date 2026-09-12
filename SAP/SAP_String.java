package SAP;

public class SAP_String {
    public static String revStr(String str){
        String[] words = str.split(" ");
        String result= "";

        for(int i=0; i<words.length; i++){
            String word = words[i].toLowerCase();
            String reversed="";

            for(int j = word.length() -1; j>=0; j--){
                reversed+=word.charAt(j);
            }
            reversed= Character.toUpperCase(reversed.charAt(0))+reversed.substring(1);
            result+=reversed;

            if(i!=words.length-1)
                result+=" ";
        }
        
        return result;
      }

    public static void main(String[] args) {
        String str= "are you sure you don't want to come for the party?";
        System.out.println(revStr(str));
      
    }
}
