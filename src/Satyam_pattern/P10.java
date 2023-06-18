package Satyam_pattern;

public class P10 {
    public static void main(String[] args) {
        //   1
        //  21
        // 321
        //4321
        for (int i=1;i<=4;i++){
            for (int k=1;k<=4-i;k++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
