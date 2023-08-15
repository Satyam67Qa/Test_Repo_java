package Satyam_Collection;

import java.util.ArrayList;

public class c1ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al= new ArrayList<>();

        al.add("A");
        al.add(10);
        al.add("A");
        al.add("");
        al.add(null);
        al.add("null");

        System.out.println(al);

        al.remove(2);

        System.out.println(al);

        al.add(2,"M");

        al.add(2);

        System.out.println(al);
    }
}
