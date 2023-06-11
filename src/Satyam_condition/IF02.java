package Satyam_condition;

public class IF02 {
    public static void main(String[] args) {
        boolean a = true;
        a =!a; //just kind of reverse
        if(a){   // condition is false so the outside loop executed
            System.out.println("Inside the loop is executed if condition is true");
        }
        System.out.println("outside the loop executed when condition is false ");
        if(2+2>=4) // or is apply here  4>4 or 4=4
        {
            System.out.println("or is apply here ");
        }
    }
}
