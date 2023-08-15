package Satyam_OOPS.Satyam_Abtraction;

public class Laptop extends Electroic{

    public Laptop(int ram, String name, String model, double price){
        super(ram,name,model,price);
    }

    @Override
    public void displayElectroicDetails() {
        System.out.println("Laptop Details:");
        System.out.println("Ram :" +getRam());
        System.out.println("Name :"+getName());
        System.out.println("Model :"+getModel());
        System.out.println("Price:"+getPrice());
    }
}

