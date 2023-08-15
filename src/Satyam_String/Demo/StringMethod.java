package Satyam_String.Demo;
/*
String_Methods
charAt()>>> Returns the character at the specified index (position) char
compareTo()>>>Compares two strings lexicographically	int        {}
codePointAt()>>>Returns the Unicode of the character at the specified index	int
length()>>>	Returns the length of a specified string	int
lastIndexOf()>>>
IndexOf()>>>
compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
replace()
replaceAll()
toLowerCase()
toUpperCase()
trim()
 */
public class StringMethod
{
    public static void main(String[] args)
    {
       String sc="I love my self";
       String sc1="I love my city";
       String sc2="city";
       String sc3="I love my country very much";
       String sc4="I LOVE MY CITY";
       String sc5="  I am  ";
       String sc6="";
        System.out.println(sc.charAt(5));// e
//        System.out.println(sc1.compareTo(sc));//0
        System.out.println(sc.codePointAt(0));// 73
        System.out.println(sc1.codePointAt(2));//108
        System.out.println(sc1.compareTo(sc));//-16
        System.out.println(sc2.length());//4
        System.out.println(sc2.lastIndexOf("t"));//2
        System.out.println(sc3.indexOf("v"));//4
        System.out.println(sc4.compareToIgnoreCase(sc1));
        System.out.println(sc2.replace("y","i"));//citi
        System.out.println(sc2.replaceAll("i","yyyyyyy"));//cyyyyyyyty
        System.out.println(sc4.toLowerCase());//i love my city
        System.out.println(sc4.toUpperCase());//I LOVE MY CITY
        System.out.println(sc.toUpperCase());//I LOVE MY SELF
        System.out.println(sc4.replace(" ",""));//ILOVEMYCITY
        System.out.println(sc5.trim());//I am
        System.out.println(sc6.isEmpty());//true
        System.out.println(sc4.isEmpty());//false
        System.out.println(sc1.substring(3));//ove my city
        //System.out.println(sc3.split());
        sc.equals(sc1);
        System.out.println(sc==sc1);
        sc3.equalsIgnoreCase(sc4);
        sc.contains(sc1);

    }
}
