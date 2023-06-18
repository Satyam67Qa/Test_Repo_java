package Satyam_pattern;

public class P8 {
    public static void main(String[] args) {
        // a unicode =98
//        a
//        abc
//        abcd
//        abcde
       for (int i=1;i<=4;i++){
           for (int j=1;j<=i;j++){
               System.out.print((char)(96+j));
           }
           System.out.println();
       }
    }
}
