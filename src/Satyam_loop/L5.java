package Satyam_loop;

public class L5 {
    public static void main(String[] args) {
        //here we using final variable so that we can not change the assign value
        final boolean i= true;
        //i = false; this will give the error as can not assign the value to final variable i
        for ( ; i; ){
            System.out.println("s");// will print s contiuous
        }
    }
}
