package Satyam_condition;

import java.util.Scanner;
import java.util.SortedMap;

public class IF05 {
    //static int max;
    public static void main(String[] args) {
        Scanner Sc1 = new Scanner(System.in);
        System.out.println("ENTER THE a,b,c");
        int a = Sc1.nextInt();
        int b = Sc1.nextInt();
        int c = Sc1.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a > b && a > c) {
            System.out.println(a);
        }
        else if (b > a && b > c) {
            System.out.println(b);
        }
        else if(c>a && c>b){
            System.out.println(c);
        }else{
        System.out.println("number are same ");
    }


}}
