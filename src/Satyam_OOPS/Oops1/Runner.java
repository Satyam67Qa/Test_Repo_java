package Satyam_OOPS.Oops1;

public class Runner {
    public static void main(String[] args) {
        Score sc = new Score(13, 8, 28, "rahul");
        Cricket c1= new Score(10,10,10,"SATYAM");
        sc.displayPlayerScore();
        sc.displayDetails();
        c1.displayDetails();
    }
}
