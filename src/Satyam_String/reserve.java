package Satyam_String;

public class reserve {
    public static void main(String[] args) {
        String s="satyam";
        String r="";
        System.out.println("Given string"+s);
        System.out.println("String length"+s.length());
        for (int i =s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        System.out.println("Resever string"+r);
    }
}
