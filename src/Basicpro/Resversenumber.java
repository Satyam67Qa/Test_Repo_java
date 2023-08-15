package Basicpro;

public class Resversenumber
{
    public static void main(String[] args)
    {
        int n = 12345;
        int temp =n;// only for penlindrom

        int rem;
        int rev = 0;


        while (temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println(rev);

        //n=rev;

        if (n==rev){
            System.out.println("p");
        }else{
            System.out.println("np");
        }
    }

}
