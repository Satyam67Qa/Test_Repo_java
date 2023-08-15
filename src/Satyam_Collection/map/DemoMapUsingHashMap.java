package Satyam_Collection.map;

import java.util.HashMap;
import java.util.Map;

public class DemoMapUsingHashMap
{
    public static void main(String[] args)
    {
        Map<Integer,String> studentDetails= new HashMap<>();
        {
            studentDetails.put(101,"Puneet");
            studentDetails.put(102,"elivesh");
            studentDetails.put(103,"Dinesh");
            studentDetails.put(104,"hitesh");
            studentDetails.put(104,"hitesh");
            System.out.println(studentDetails);  //{101=Puneet, 102=elivesh, 103=Dinesh, 104=hitesh}
            for (Map.Entry<Integer,String> singlesturdentdetails:studentDetails.entrySet())
            {
                System.out.println("Key is: "+singlesturdentdetails.getKey()+"\t value is "+singlesturdentdetails.getValue());
                //Key is: 101	 value is Puneet
                //Key is: 102	 value is elivesh
                //Key is: 103	 value is Dinesh
                //Key is: 104	 value is hitesh
            }
        }
        
    }

}
