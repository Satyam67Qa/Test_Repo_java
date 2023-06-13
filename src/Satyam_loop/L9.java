package Satyam_loop;

import java.util.Scanner;

public class L9 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value");
        int i,j;

        i=sc.nextInt();
       // j=sc.nextInt();
        System.out.println("print the pattern");
        for ( ;i<=3;i++){
            for ( j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
