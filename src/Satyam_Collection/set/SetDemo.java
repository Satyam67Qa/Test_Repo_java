package Satyam_Collection.set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args)
    {
        Set<Integer> set= new HashSet<>();

        Set<Integer> set1= new HashSet<>();

        Set<String> set2= new HashSet<>();

        HashSet<String> hset= new HashSet<>();

        hset.add("Sachin");
        hset.add("Anjali");
        hset.add("Virat");
        hset.add("Anushka");


        System.out.println(hset);




        set2.add("23");set2.add("56");set2.add("45");
        System.out.println(set2);

//        Set<int> set1= new HashSet<>();


        set.add(23);
        set.add(56);
        set.add(45);
        set.add(null);// set doesnt contain null

        System.out.println(set);

        set.add(45);
        set.add(null);

        System.out.println(set);

        set.remove(null);

        System.out.println(set);

        set.equals(new HashSet<>());

        System.out.println(set);

        System.out.println(set1);

        set1.add(23);
        set1.add(56);
        set1.add(45);

        System.out.println(set1);

        System.out.println(set1.equals(set));

        System.out.println(set1.equals(set2));


        Iterator<Integer> its = set.iterator();

        System.out.println(its.getClass());

        Iterator<Integer> its1 = set1.iterator();

        System.out.println(its1.equals(its));

        while (its.hasNext())

        {

            System.out.println(its.next());

        }

        while (its1.hasNext())

        {

            System.out.println(its1.next());

        }













    }
}
