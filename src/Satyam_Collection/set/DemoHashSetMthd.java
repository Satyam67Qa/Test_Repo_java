package Satyam_Collection.set;
/* How is it useful in automation testing (QA) for real-time frameworks?

In automation testing, comparing the expected state of an object with its actual state is a common scenario.
When dealing with Sets or any other collections, hash codes can be useful in determining
if the contents of two objects are equal.

For example, in TestNG or JUnit test cases, you might assert that the actual result (a Set in this case)
should match the expected result (another Set). Instead of comparing each element individually,
you can compare the hash codes of the two sets. If the hash codes match, it is highly likely that the contents are the same.

add()
remove()
isEmpty()
clear()
size()
hashcode()
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSetMthd
{
    public void display()
    {
        System.out.println("My name is satyam");
    }

    public static void main(String[] args)
    {
        Set<String> setRainbowColors = new HashSet<>();
        setRainbowColors.add("Violet");
        setRainbowColors.add("Indigo");
        setRainbowColors.add("Blue");
        setRainbowColors.add("Green");
        setRainbowColors.add("Yellow");
        setRainbowColors.add("Orange");
        setRainbowColors.add("Red");
        System.out.println(setRainbowColors);
        Iterator<String> itr = setRainbowColors.iterator();
        while (itr.hasNext())
        {
            System.out.println("Value of colors:" + itr.next());
        }
        System.out.println("Size of above collection is:" + setRainbowColors.size());
        System.out.println("Adding collection? " + setRainbowColors.addAll(setRainbowColors));
        System.out.println("Collection now is:" + setRainbowColors.containsAll(setRainbowColors) + "\t grown as \t" + setRainbowColors);
        System.out.println(setRainbowColors.hashCode());
        setRainbowColors.remove("Blue");
        System.out.println(setRainbowColors);
        if (setRainbowColors.contains("Indigo"))
        {
            setRainbowColors.add("Blue");
            System.out.println(setRainbowColors);
        }
        Set<String> setColors = new HashSet<>();
        setColors.add("Red");
        setColors.add("Violet");
        setColors.add("Blue");
        System.out.println(setColors);
        System.out.println(setColors.equals(setRainbowColors));
        setColors.clear();


    }
}