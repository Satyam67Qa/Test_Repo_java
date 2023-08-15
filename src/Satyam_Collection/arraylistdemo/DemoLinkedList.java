package Satyam_Collection.arraylistdemo;
/*
add(E e): Adds an element to the end of the list.
iterator(): Returns an iterator to traverse the elements in the list.
add(int index, E element): Adds an element at the specified index.
remove(Object o): Removes the first occurrence of the specified element from the list.
getFirst(): Returns the first element of the list.
contains():
getLast(): Returns the last element of the list.

IN REALTIME THIS IS USED:
Maintaining Test Steps Order:
In automation testing, you often define test steps that need to be executed in a specific order.
 LinkedList can be used to store test steps in the order they should be executed.
It allows easy insertion and removal of steps, making it useful when test cases require frequent changes or reordering of steps.

Page Objects in UI Testing:
In UI automation, you typically use the Page Object Model (POM) design pattern to represent web pages as objects.
Each page object represents a web page, and it contains elements and corresponding methods to interact with the page.
In some cases, the sequence of actions on a page can be dynamic, based on certain conditions. LinkedList can be used to manage the sequence of actions for such scenarios.


Storing Results and Logs:
When running automation tests, you may need to log test results or other information during test execution.
 LinkedList can be used to store logs or test results in the order they occur. This can be useful for generating detailed test reports or tracking the test execution flow.

Test Data Management:
In automation testing, you often need to manage test data for different test cases.
Test data can be stored in a LinkedList if the order of data entries matters, and you need to manipulate the data frequently.

Handling Queue-Like Behavior:
In some automation scenarios, you might encounter a queue-like behavior, where elements are frequently added and removed from both ends of the list.
A LinkedList can efficiently handle such scenarios since it allows adding and removing elements from both ends in constant time.





*/

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList
{
    public static void main(String[] args)
    {

    //        LinkedList<String> linkedListFruits=new ArrayList<>();//why not possible ?

    LinkedList<String> linkedListFruits=new LinkedList<>();

        linkedListFruits.add("Apple");
        linkedListFruits.add("Banana");
        linkedListFruits.add("Apple");
        linkedListFruits.add("Grapes");
        linkedListFruits.add("Apples");

        System.out.println("Fruit at 1st index is:"+linkedListFruits.get(0));
        System.out.println();
        linkedListFruits.add(0,"Dragon fruit");
        System.out.println("1st fruit is:"+ linkedListFruits.getFirst());
        System.out.println("Last fruit is:"+linkedListFruits.getLast());
        System.out.println(linkedListFruits);
        System.out.println(linkedListFruits);
        for (String fruit:linkedListFruits)
        {
        System.out.println(fruit);
    }

    Iterator<String> itr = linkedListFruits.iterator();
        while (itr.hasNext())
        {
        System.out.println(itr.next());
    }
        linkedListFruits.remove("Apple");
        System.out.println(linkedListFruits);
}
}

