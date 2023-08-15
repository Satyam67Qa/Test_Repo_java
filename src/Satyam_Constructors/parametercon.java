package Satyam_Constructors;

class parametercon1
{
    int i ;
    String s;
    parametercon1(int i ,String s)

    {
        System.out.println("we can use class and method variable");

        this.i=i;
        this.s=s;

        System.out.println("con veribale "+i);
        System.out.println("con veribale "+s);

    }

    public static void main(String[] args)
    {
        parametercon1 p =new parametercon1(10, "satyam");

        System.out.println("main "+p.i);
        System.out.println("main"+p.s);
    }
    
}
