package Satyam_switch;

public class SW06 {

    public static void main(String[] args) {
        //nested switch finding sub in the year
        String Branch=" ";//
        int year=1; //v2 >> condition
        switch (year) {
            case 1:
                switch (Branch) {
                    case "com":
                        System.out.println("123");
                        break;
                    case "ext":
                        System.out.println("453");
                        break;
                    case "mech":
                        System.out.println("999");
                        break;
                    default:
                        System.out.println("select yor branch");
                }
                break;
            //System.out.println("English, Maths, Science");break;
            case 2:
                switch (Branch) {
                    case "com":
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case "ext":
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case "mech":
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch (Branch) {
                    case "com":
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case "ext":
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case "mech":
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;

                }
                break;
            case 4:
                switch (Branch) {
                    case "com":
                        System.out.println("XYZ");
                        break;
                    case "ext":
                        System.out.println("ABC");
                        break;
                    case "mech":
                        System.out.println("PQR");
                        break;
                }
                break;
            default:
                System.out.println("select yor year");
        }
        //default:
       // System.out.println("select yor branch");

    }
}
