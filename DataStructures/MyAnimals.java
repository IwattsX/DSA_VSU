// package DataStructures;
/**
 * Author: Isaac Watts
 * Date: 11/19/23
 * Description: Demonstrate a HashSet and HashMap
 */
import java.util.HashMap;
import java.util.HashSet;

public class MyAnimals {
    public static void main(String[] args) {
        HashSet<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Rabbit");
        animals.add("Penguin");

        System.out.println(animals);

        System.out.println("Does animal contain Rabbit: " + animals.contains("Rabbit"));
        System.out.println("Size of HashSet is " + animals.size());

        animals.remove("Rabbit");
        System.out.println(animals);
        for(String s: animals){
            System.out.println(s);
        }
        animals.clear();

        System.out.println(animals);

        HashMap<String, String> unis = new HashMap<>();

        unis.put("VSU", "Trojans");
        unis.put("NSU", "Spartans");
        unis.put("HU", "Pirates");

        System.out.println(unis);
        System.out.println(unis.get("VSU"));
        //NULL if not in Hashmap
        // System.out.println(unis.get("HHH"));


        System.out.println(unis.remove("VSU"));

        System.out.println("Unis size = " + unis.size());

        for (String college : unis.keySet()) {
            System.out.println(college);
        }
        for (String mascot: unis.values()) {
            System.out.println(mascot);
        }

    }
}
