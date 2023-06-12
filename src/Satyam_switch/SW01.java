package Satyam_switch;

public class SW01 {
    public static void main(String[] args) {
        int day=5;

        switch (day){
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("tuesday");break;
            case 3:
                System.out.println("wednesday");break;
            case 4:
                System.out.println("thrusday");break;
            case 5:
                System.out.println("friday");break;
            case 6:
                System.out.println("satrday");break;
            case 7:
                System.out.println("sunday");break;
            default:
                System.out.println("week");
        }
    }
}
