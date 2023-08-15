package Satyam_String;

public class S4 {
    public static void main(String[] args) {
        String Name = "  satyam  ";
        System.out.println(Name.length());
        System.out.println(Name.trim());
        System.out.println(Name.trim().length());
        System.out.println(Name.length());
        if (Name.trim().length()==0){
            System.out.println("Name is  empty");
        }

    }
}
