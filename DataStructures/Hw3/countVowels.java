/**
 * Author: Isaac Watts
 * Date: 09/20/23
 * Description: Find # of vowels in a string
 * 
 * Please enter a string: this class is data structures 
 * The number of vowels is: 8 
 */
import java.util.HashMap;
import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        HashMap<Character, Boolean> vowels = createVowelMap();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String input = sc.nextLine();

        System.out.println("The number of vowels is: " + vowelCount(input, vowels));
        sc.close();
    }

    public static int vowelCount(String s, HashMap<Character, Boolean> vowels) {
        s = s.toLowerCase();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.containsKey(s.charAt(i)))
                res++;
        }
        return res;
    }

    public static HashMap<Character, Boolean> createVowelMap() {
        HashMap<Character, Boolean> HM = new HashMap<>();
        HM.put('a', true);
        HM.put('e', true);
        HM.put('i', true);
        HM.put('o', true);
        HM.put('u', true);
        return HM;
    }
}
