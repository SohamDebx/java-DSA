package SAP;

public class String_reverse {
    public static String  rev(String str){
        String result="";
        
        for(int i = str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str="Soham";
        System.out.print(rev(str));
    }
}
