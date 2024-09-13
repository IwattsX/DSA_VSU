/**
 * Author: Isaac Watts
 * Date: 11/06/23
 * Description: Java program to demonstrate ArrayList
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class color{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Black");

        System.out.println(colors);
        System.out.println("The value at position 0 is: " + colors.get(0));
        colors.set(0, "yellow");

        System.out.println("The value at postion 0 is now " + colors.get(0));

        // colors.remove(0);
        System.out.println(colors);

        // colors.clear();
        System.out.println(colors);
        
        int size = colors.size();
        System.out.printf("The size of the ArrayList is %d.%n", size);

        for(int i = 0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }

        Collections.sort(colors);

        for(String color : colors){
            System.out.println(color);
        }

        //LINKED LIST have the same methods...
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.addLast("Stawberry");
        fruits.addLast("Banana");
        fruits.addLast("grape");
        
        System.out.println(fruits);

        fruits.removeFirst();
        System.out.println(fruits);

        fruits.removeLast();
        System.out.println(fruits);

        System.out.println("The first value in the linked list: " +fruits.getFirst());

        System.out.println("The last value in the linked list: " + fruits.getLast());

        System.out.println("Does fruits contain grape: " + fruits.contains("grape"));

        System.out.println(fruits.get(0));
    }
}