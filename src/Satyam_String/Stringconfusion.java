package Satyam_String;

public class Stringconfusion {
    public static void main(String[] args) {


    String s1= new String("You cannot change me");
    String s2= new String("You cannot change me");
        System.out.println(s1==s2);

    String s3="You cannot change me";
        System.out.println(s1==s3);

    String s4="You cannot change me";
        System.out.println(s3==s4);

    String s5="You cannot "+"change me";
        System.out.println(s4==s5);

    String s6="You cannot ";
    String s7=s6+"change me";
        System.out.println(s4==s7);

    String s8="You cannot ";
    String s9=s8.concat("change me");
        System.out.println(s4==s9);

    final String s10="You cannot ";
           String s11=s10+"change me";
        System.out.println(s4==s11);

}}
