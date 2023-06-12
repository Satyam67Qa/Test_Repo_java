package Satyam_switch;

public class SW11 {
    public static void main(String[] args) {
        //JDK 13 u can check the multiple  condition in same case
            int itemcode=107;
            switch (itemcode){
                case 101,103,105:
                    System.out.println("electronic ");break;
                case 104,102:
                    System.out.println("computer");break;
                default:
                    System.out.println("menical");
            }
    }
}
