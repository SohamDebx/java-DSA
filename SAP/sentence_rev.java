package SAP;

public class sentence_rev {
    public static void sen_rev(String str){
        String res="";
        String[] sarr= str.split(" ");
        for(int i=sarr.length-1;i>=0;i--){
            res+=sarr[i]+" ";
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        String str= "This is a line";
        sen_rev(str);
    }
}
