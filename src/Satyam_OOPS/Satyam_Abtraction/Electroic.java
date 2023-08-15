package Satyam_OOPS.Satyam_Abtraction;

 public abstract   class Electroic
 {
     private int ram;
     private String name;
     private String model;
     private double price;


     public Electroic (int ram, String name ,String model ,double price)
     {
         this.name=name;
         this.ram=ram;
         this.model=model;
         this.price=price;
     }

     public abstract void displayElectroicDetails();

     public void setRam(int ram)
     {
         this.ram=ram;
     }

     public int getRam()
     {
         return ram;
     }

     public void setName(String name)
     {
         this.name=name;
     }
     public String getName()
     {
         return name;
     }

     public void setModel(String model)
     {
         this.model=model;
     }
     public String getModel()
     {
         return model;
     }
     public void setPrice(double price)
     {
         this.price=price;
     }
     public double getPrice()
     {
         return price;
     }

 }
