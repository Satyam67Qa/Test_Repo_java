package Satyam_condition;

import java.util.Scanner;

public class IF04 {
    public static void main(String[] args) {
        //take an input , say odd or even
        Scanner sc=new Scanner(System.in);//it is scanner class perent in java util , scanner is used as take input from user
        System.out.println("enter your number, will tell you odd nd even");
        int a =sc.nextInt();
        if(a%2==0){
            System.out.println(a+ "the number is even number");
        }else {
            System.out.println(a+"the number is odd number");
        }
    }
}
