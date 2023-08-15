package Satyam_Collection.set;
/*  add(E e): Adds an element to the set.
iterator(): Returns an iterator to traverse the elements in the set.
remove(Object o): Removes the specified element from the set.
contains(Object o): Checks if the set contains the specified element.

IN REAL TIME IS USED:

Maintaining Order of Test Steps:
In automation testing, test cases often consist of multiple steps that need to be executed in a specific order.
 The LinkedHashSet can be used to store the test steps in the order they should be executed while automatically eliminating any duplicate steps.
 This ensures that each step is executed only once, and the order of execution remains intact.

Handling Unique Element Collections:
When testing user interfaces, you might encounter scenarios where you need to interact with various UI elements.
 The LinkedHashSet can be useful to keep track of the unique elements encountered during test execution while preserving the order in which they were accessed.
  This is particularly helpful when you want to log the order of UI element interactions or ensure that each element is handled only once.

Recording Test Results and Logs:
In automation testing, logging test results and other relevant information is crucial for test reporting and debugging.
LinkedHashSet can be used to store log messages or test results in the order they occur, ensuring that they are displayed in the same sequence during test execution and reporting.

Page Objects with Unique Elements:
In UI automation, Page Object Model (POM) is widely used to represent web pages as objects. Each page object encapsulates the elements and actions on a specific web page.
 A LinkedHashSet can be employed to maintain the unique elements encountered on each page during test execution, allowing easy retrieval of unique elements.

Managing Lists with Unique Entries:
In some automation scenarios, you might deal with lists containing unique entries, and you need to ensure that there are no duplicates.
The LinkedHashSet can help to validate and store unique entries while preserving the order in which they were added.
*/

import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoLinkedHashedSet
{
    public static void main(String[] args)
    {

        LinkedHashSet<String> linkedHashSetCities=new LinkedHashSet<>();

        linkedHashSetCities.add("Delhi");
        linkedHashSetCities.add("Pune");
        linkedHashSetCities.add("Mumbai");
        linkedHashSetCities.add("Bangalore");

        System.out.println(linkedHashSetCities);

        if(linkedHashSetCities.contains("Mumbai"))
        {
            System.out.println("Mumbai is present in city collection!!!");
            System.out.println("Size of city collection is:"+ linkedHashSetCities.size());
        }
        Iterator<String> itr =linkedHashSetCities.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

}
}

