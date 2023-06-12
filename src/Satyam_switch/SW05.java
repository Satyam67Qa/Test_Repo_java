package Satyam_switch;

public class SW05 {
    public static void main(String[] args) {
        //Write a program to print remark according to the grade obtained using switch statement
        char Grade= ' ';
        int number = 70;
        switch (Grade){
            case 'A':number=80;break;
            case 'B':number=70;break;
            case 'C':number=50;break;
            case 'D':number=35;break;
            default:number=0;break;
        }
        System.out.println("my result is" +number + " , " +Grade);
    }
}
