package Satyam_String;

public class Stringconfusion3 {
    public static void main(String[] args) {
        String s1= "satyam";
        String s2=s1.toString();
        String s3= s1.toLowerCase();
        String s4=s1.toUpperCase();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
    }
}
