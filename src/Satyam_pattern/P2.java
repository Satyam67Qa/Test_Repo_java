package Satyam_pattern;

public class P2 {
    public static void main(String[] args) {
//        1              1
//        123            222
//        12345          33333
//        1234567        4444444
        int j=1;
        for (int i=1;i<=4;i++){
            for (;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
