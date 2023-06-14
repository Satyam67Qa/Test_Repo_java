package Satyam_loop;

public class L13 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(i);// 1\n22
//                1
//                22
//                333
//                4444
//                55555
                System.out.print(j);//1\n 12
//                1
//                12
//                123
//                1234
//                12345
            }
            System.out.println();
        }
    }
}
