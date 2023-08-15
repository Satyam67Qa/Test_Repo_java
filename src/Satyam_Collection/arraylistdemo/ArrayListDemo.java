package Satyam_Collection.arraylistdemo;

import Satyam_OOPS.oops.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String>arrayList=new ArrayList<>();

        List<String>list = new ArrayList<>();
//
//        arrayList.add("ram");
//        arrayList.add("sham");
//        arrayList.add("gam");
//
//         list.hashCode();
//         arrayList.hashCode();
//
//        System.out.println("Array list :"+arrayList);
//
//        list.add("satyam");
//        list.add("singh");
//        list.add("prince");
//
//        System.out.println("list :"+list);
//
//        for (int i=0;i<list.size();i++)
//        {
//            System.out.println("print list one by one"+list.get(i));
//        }
//
//        String new_string = list.set(1, "km");
//
//        System.out.println("list index 1 set new string : "+new_string);
//
//        System.out.println("new list :"+list);
//
//        System.out.println(list.add("singh"));
//
//        System.out.println(list);
//
//        System.out.println(list.addAll(arrayList));
//
//        System.out.println(list);
//
//        System.out.println(list.contains("hhh"));
//
//        System.out.println(list.remove(1));
//
//        System.out.println(list);
//
//        System.out.println(list.add("ram"));
//
//        System.out.println(list);
//
//        list.indexOf("ram");
//
//        System.out.println(list);
//
//        boolean check_list_c_a = list.containsAll(arrayList);
//
//        System.out.println(check_list_c_a);
//
//        for (int j=0; j<list.size();j++)
//        {
//
//            System.out.println(list.get(j));
//
//        }

        // using other class in list

        List<Car> carList= new ArrayList<>();

        Car tr1= new Car("Maharashtra","Mumbai","India",2);

        carList.add(tr1);



        System.out.println(carList);// [Satyam_OOPS.oops.Car@3feba861]>>>


       // Iterator interface ( want to fetch value one by one)

        Iterator<String> itral = arrayList.iterator();

        while (itral.hasNext())

        {
            System.out.println(itral.next());
        }








    }





}
