package Satyam_pattern;

public class P5 {
    public static void main(String[] args) {
//        1234567
//        12345
//        123
//        1
        for (int i=4;i>=1;i--){
            for (int j=1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}
