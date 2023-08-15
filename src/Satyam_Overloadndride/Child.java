package Satyam_Overloadndride;

public class Child extends Parant{
    public void sum(int a, int b) // override methed
    {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Child C1 = new Child();  // overload beasuse same class
        C1.sum(2,3);

        Parant P1 =  new Parant();
        P1.sum(4,8);

        // Child C2 =new Parant(); // parant con not use the child method  gives the error class cast exception

        Parant P2 = new Child(); //   downcasting
        Child C2 = (Child) P2;
        C2.sum(4,6);


        Parant P3 =new Child();   // object will call methods ,while run time object will dicede
        P3.sum(5,6);

        // C>>P Upcasting
        // P>>C downcasting
        // over ride >> run time/dynamic binding  polymorphisn
        // over load >> complie poly
    }
}
