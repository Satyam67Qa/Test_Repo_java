package Satyam_condition;

public class IF07 {
    public static void main(String[] args) {
        //nasted if You are eligible to donate blood
        int age= 18;
        int weight =64;
        if(age>=18)
        {
         if (weight>=65) {
             System.out.println("you are eligible to donate blood");
         }else {
             System.out.println("you are not eligible");
         }
        }else {
            System.out.println("your ege must 18 or grater then 18");
        }
    }
}
