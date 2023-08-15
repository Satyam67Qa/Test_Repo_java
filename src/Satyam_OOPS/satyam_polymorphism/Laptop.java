package Satyam_OOPS.satyam_polymorphism;

public class Laptop extends Electronics{
    private int rom;
    public Laptop(int ram, String name, String model,int rom)
    {
        super(ram,name,model);
        this.rom=rom;
    }

    @Override
    public void displayElectronicsDetails() {
        System.out.println("Laptop detals :.....");
        System.out.println("Ram :" +getRam());
        System.out.println("Name :"+getName());
        System.out.println("Model :"+getModel());
        System.out.println("Rom"+rom);
    }
}
