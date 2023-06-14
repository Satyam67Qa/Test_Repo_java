package Satyam_loop;

public class L15 {
    public static void main(String[] args) {
//        1                 i=row i=1      j=col j=1>1
//        123                     i=3            j=1,2,3
//        12345                   i=5
//        1234567                  i=7
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i*4-1;j++ )//if we want any table at the end we have to multi by the row no,,, -1 if want to odd at the end
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
