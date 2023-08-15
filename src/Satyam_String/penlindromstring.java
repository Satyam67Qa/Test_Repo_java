package Satyam_String;

public class penlindromstring {
    public static void main(String[] args) {
        String S="Madam";
        String r="";
        for (int i=S.length()-1;i>=0;i--){
            r=r+S.charAt(i);
            //System.out.println(r);
        }
        System.out.println(r);

        if(S.equalsIgnoreCase(r)){
            System.out.println("pelindrom");
        }else {
            System.out.println("Not pelindrome");
        }
    }


}
