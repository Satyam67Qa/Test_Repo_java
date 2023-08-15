package Satyam_OOPS.satyam_polymorphism;

public class Electronics {
    private int ram;
    private String name;
    private String model;
    //private double price;

    public Electronics (int ram,String name,String model){
        this.ram=ram;
        this.name=name;
        this.model=model;
        //this.price=price;
    }
    public void setRam(int ram){
        this.ram=ram;
    }
    public int getRam(){
        return ram;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }

    public void  displayElectronicsDetails(){
        System.out.println(" Electronics details :>>>");
        System.out.println("ram of electronics is :" +getRam());
        System.out.println("Name of electronics is :" +getName());
        System.out.println("Model of electronics is :" +getModel());
    }
}
