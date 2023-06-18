package Satyam_pattern;

public class P13 {
    public static void main(String[] args) {
//        when this // (i=1;i<=4;i++)
   //           1
//            1 2 3
//          1 2 3 4 5
//        1 2 3 4 5 6 7

//       when  for(i=4;i>=1;i--)
//            1 2 3 4 5 6 7
//          1 2 3 4 5
//            1 2 3
//              1

        int i,j,k;
        for(i=4;i>=1;i--)
        {
            for (k=1;k<=4-i;k++){
                System.out.print("  ");
            }
            for (j=1;j<=2*i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
