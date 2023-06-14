package Satyam_loop;

public class L14 {
    public static void main(String[] args) {
        //12345   >>>i=5(row,outer)   >>>j=1,2,3,4,5(col,inner)
        //1234    >>>i=4   >>>j=1>4
        //123     >>>i=3   >>>j=1>3
        //12      >>>i=2   >>>j=1>2
        //1       >>>i=1  >>>j=1>1
          for (int i=5;i>=1;i--)//
          {
              for (int j=1;j<=i;j++) // we need to print j=1,2,3,4,5
              {
                  //System.out.print(j + "  ");//
                  System.out.print(i); //55555
                  //4444
                  //333
                  //22
                  //1
              }
              System.out.println();
          }
    }
}
