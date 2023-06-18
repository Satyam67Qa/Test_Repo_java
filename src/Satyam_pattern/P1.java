package Satyam_pattern;

public class P1 {
    public static void main(String[] args) {
//       12345      55555  *****  55555
//       1234       5555   ****   4444
//       123        555    ***    333
//       12         55     **     22
//       1          5      *      1
        for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                //System.out.print(j);//this 1
                //System.out.print(i);//4
//                System.out.print(5);//2
//                System.out.print("*");
            }
            System.out.println();
        }
    }
}
