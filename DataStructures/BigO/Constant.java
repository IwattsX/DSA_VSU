package DataStructures.BigO;

import java.util.HashMap;

public class Constant {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Isaac", 100);
        grades.put("Dalton", 100);
        grades.put("Jerry", 60);
        grades.put("Jessica", 90);

        System.out.println(grades.get("Isaac")); //O(1)

    }
}
