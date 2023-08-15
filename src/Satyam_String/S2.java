package Satyam_String;

public class S2 {
    public static void main(String[] args) {
        String Name= "";
        String Email="abc@gmail.com";
        String Password="abc123";

        System.out.println(Name.length());
        System.out.println(Name.isEmpty());
        System.out.println(Email.trim());// trim remove spaces from start or end
        int i=Name.length();
        if(i==0){
            System.out.println("name is empty");
        }
    }
}
