package Satyam_switch;

public class SW12 {
    public static void main(String[] args) {
        //jdk 13 use return the value using yield
        //two different type of patteren in switch case only more then jdk 13
        String code ="w";
        int val = switch (code){
            case"x","y":
                yield 1;
            case "w","z":
                yield 2;
            default:yield 3;

        };
        System.out.println(val);
        int itemcode=005;
        switch (itemcode){
            case 001-> System.out.println("laptop");
            case 003,005-> System.out.println("cramra");
            default -> System.out.println("hello");
        }
    }
}
