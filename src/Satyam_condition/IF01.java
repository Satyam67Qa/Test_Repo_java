package Satyam_condition;

public class IF01 {
    public static void main(String args[]){
        boolean isDinnerReady= false;  //it is local variable so jvm not assign the value we should assign
       // boolean a= false;
        if(isDinnerReady) {   //here condition is false
            System.out.println("NO");
        }
       // System.out.println("Yes");
    }




}
