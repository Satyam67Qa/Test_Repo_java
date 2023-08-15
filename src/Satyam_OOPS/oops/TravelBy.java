/*
 Abstract
 Encapsulation
 */

package Satyam_OOPS.oops;

public abstract class TravelBy {

    private String state;

    private String city;

    private String country;


    public TravelBy(String state ,String city,String country){
       this.state =state;
       this.city=city;
       this.country=country;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


    public void displayTravelDetails(){
        System.out.println("Travel details are :");
        System.out.println("Destination country :"+ getCountry());
        System.out.println("Destination City :"+ getCity());
        System.out.println("Destination State :"+ getState());
    }

     public abstract void  displayFare();


    //public static void main(String[] args) {
//        TravelBy t=new TravelBy("Maharashtra","mumbai","India");
//        t.displayTravelDetails();

    }

