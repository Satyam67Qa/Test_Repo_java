package Satyam_OOPS.Satyam_Abtraction;

public class Testmain {
    public static void main(String[] args) {
        Laptop l=new Laptop(16,"Dell","MU12",123.67);
        l.displayElectroicDetails();
        l.setName("Lenovo");
        l.setRam(8);
        System.out.println("new deatils");
        l.displayElectroicDetails();
    }
}
