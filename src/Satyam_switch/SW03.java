package Satyam_switch;

public class SW03 {
    public static void main(String[] args) {
        //Write a program to read gender(M/F) and print the corresponding gender using a switch statement
         char gender= 'F';
         switch (gender){
             case 'm':
                 System.out.println("gender male- m");break;
             case 'f':
                 System.out.println("gender female -f");break;
             case 'F':
                 System.out.println("Gender Female -F");break;
             case 'M':
                 System.out.println("Gender Male -M");break;
             default:
                 System.out.println("other");
         }

    }
}
