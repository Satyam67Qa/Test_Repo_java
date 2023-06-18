package Satyam_pattern;

public class P14 {
    public static void main(String[] args) {
//                1
//              2 1 2
//            3 2 1 2 3
//          4 3 2 1 2 3 4


        for(int i=1;i<=4;i++)
       {
           for (int k=1;k<=4-i;k++)
           {
               System.out.print("  ");
           }
           for (int j=i;j>=1;j--)
           {
               System.out.print(j+ " ");
           }
           if(i>=2)
           {
               for (int j=2;j<=i;j++)
               {
                   System.out.print(j+" ");
               }

           }
           System.out.println(" ");

       }
    }
}
