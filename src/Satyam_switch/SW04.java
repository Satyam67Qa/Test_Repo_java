package Satyam_switch;

import java.util.Scanner;

public class SW04 {
    public static void main(String[] args) {
        //Write a program to Check whether the number is even or odd using switch statement
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int num ;
        num=sc.nextInt();
        //System.out.println("enter the number=");

        switch (num%2){
            case 0:
                System.out.println("Even");break;
            case 1:
                System.out.println("Odd");break;
            //default:
               // System.out.println("Not even not odd");
        }
    }
}
