package Basicpro;

import java.util.Scanner;

public class maxoccurcharstring {
    public static void main(String[] args)
    {

        System.out.println("enter the string...");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("String is>>>>"+str);

        int []arr =new int[256];

        for(int i=0;i<str.length();i++)
        {
            //System.out.println("find the length of the string  "+str.length());
            System.out.println("find the index value of each char in sting  "  +str.charAt(i));
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;

        }
        int max=-1;
        char ch=' ';

        for(int i=0;i<str.length();i++)
        {
            if(max<arr[str.charAt(i)])
            {

            max=arr[str.charAt(i)];

            ch=str.charAt(i);

            }

        }
        System.out.println(max);
        System.out.println(ch);
}
}
