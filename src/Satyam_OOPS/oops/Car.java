package Satyam_OOPS.oops;


//Inheritance: car (child) TravelBy (parent or super class)

// up casting child extend parent
public class Car extends TravelBy{
       private float km;
// polymorphism
// overloading
    public Car(String state, String city, String country,float km)
    {

        super(state, city, country);
        this.km=km;
    }



    @Override
    public void displayFare() {
        System.out.println("Fare By car is : 1000");
    }

    //Encapsulation
    public void setKm(){
        this.km=km;
    }

    @Override
    public String toString() {
        return this.getState();

    }

    public float getKm(){
        return km;

    }


    @Override
    public void displayTravelDetails() {
       // super.displayTravelDetails();
        System.out.println("Travel By Car : ");
        System.out.println("Travel BY Car in  state"+getState());
        System.out.println("Travel By Car in city "+getCity());
        System.out.println("Travel By Car in country" +getCountry());
        System.out.println("Travel By Car Km"+getKm());
    }

    public static void main(String[] args) {
//        TravelBy t=new TravelBy("Maharashtra","mumbai","India");
        Car c=new Car("Maharashtra","Mumbai","India",1);
        TravelBy t1=new Car("Punjab","Amritsar","India",2);
        c.displayTravelDetails();
//        t.displayTravelDetails();
        t1.displayTravelDetails();
        t1.displayFare();
    }
}
