package Satyam_switch;

public class SW08 {
    public static void main(String[] args) {
        char ch=' ';
        if(ch>=65&&ch<=90){
            switch (ch){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("char is vowel");break;
                default:
                    System.out.println("char is consonant");

            }
        }else
        {
            System.out.println("invalid alphabate");
        }
    }
}
