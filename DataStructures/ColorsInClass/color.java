/*
 * Author: Isaac Watts
 * Date: 09/06/2023
 * Description: Write a program called colors.java that demonstrates arrays
 */

import java.util.*;

public class color {
    public static void main(String[] args) {

        // string arr
        String[] colors = { "orange", "yellow", "green" };

        System.out.printf("My color is: %s%n", colors[0]);

        colors[0] = "red";

        System.out.println(Arrays.toString(colors));

        // int length = colors.length;
        // System.out.printf("The length of the array is: %d%n", length);

        System.out.printf("The length of the array is: %d%n", colors.length);

        System.out.println("-----------------");
        System.out.println("-\t Standard for loop");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("- \tfor each loop Arrays");
        for (String color : colors) {
            System.out.println(color);
        }

        //Looks like JavaScript
        System.out.println("- \tfor each method using list");
        List<String> list = Arrays.asList(colors);
        list.forEach(element -> {
            System.out.println(element);
        });
    }
}
