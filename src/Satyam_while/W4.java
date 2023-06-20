package Satyam_while;

public class W4 {

    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println(i);
            if (i > 2){
                //  continue;
                break; // if break is not here it will run contiune
            }else {
               // i++;
                i--; // if use these it will run infinite and if condition fail
                //break;
            }
        }
    }
}
