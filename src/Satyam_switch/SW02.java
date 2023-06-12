package Satyam_switch;

public class SW02 {
    public static void main(String[] args) {
        String levelstring= " ";
        int level =0;
        switch (levelstring){
            case "Beginner":level=1;break;
            case "Midtor"  :level=2;break;
            case "Expert"  :level=3;break;
            default:level=0;break;
        }
        System.out.println("my level is " +levelstring  + " , "+level );  //call dec
    }
}
