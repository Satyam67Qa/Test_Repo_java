package Satyam_pattern;

public class P4 {
    public static void main(String[] args) {
//        12              1  1
//        1234            2  2  2  2
//        123456          3  3  3  3  3  3
//        12345678        4  4  4  4  4  4  4  4
//
        for (int i =1;i<=4;i++){
            for (int j=1;j<=2*i;j++){
                System.out.print(i+"  ");
            }
            System.out.println("   ");
        }
    }
}
