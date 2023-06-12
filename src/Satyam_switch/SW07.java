package Satyam_switch;

public class SW07 {
     public static void main(String args[]){
        int a=45;
        final int x=20;

        switch (a){
            case 10:
                System.out.println("Ten");break;
            case x:
                System.out.println("twenty");break;
            case 'A':
                System.out.println("char- A");break;
            case 10+20+15:
                System.out.println("expected");break;
            default:
                System.out.println("default");
        }

            System.out.println("out side of switch"); // it will run becuse out of switch
    }
}
