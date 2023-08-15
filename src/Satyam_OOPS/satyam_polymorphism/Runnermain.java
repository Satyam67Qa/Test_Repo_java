package Satyam_OOPS.satyam_polymorphism;

public class Runnermain {
    public static void main(String[] args) {
        Electronics E =new Electronics(8,"mac","khg2");
        Electronics l=new Laptop(16,"dell","khj787",256);
        E.displayElectronicsDetails();
        l.displayElectronicsDetails();

    }
}
