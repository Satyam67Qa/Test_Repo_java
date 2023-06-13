package Satyam_loop;

public class L8 {
    public static void main(String[] args) {
        int i=0,j,k;
        for (;i<=4;i++){
            System.out.println("Start  i loop");
            for (j=1;j<=3;j++){
                System.out.println("start j loop ");
                for (k=1;k<=3;k++){
                    System.out.println("k loop ");
                System.out.println(i+ "  " +j + "  " +k);
            }
            System.out.println("outer loop");
        }
    }


}}
