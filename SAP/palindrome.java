package SAP;

public class palindrome {
    public static boolean pali(String str){

        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i>=0 ; i--){
            sb.append(str.charAt(i));           
        }

        if(sb.toString().equals(str))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        String str= "mom";
        System.out.println(pali(str));
    }
}
