// package DataStructures.Palindrome;
/**
 * Author: Isaac Watts
 * Date: 10/20/23
 * Description: Recursive palindrome solution
 */

import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String input = sc.nextLine();
        String alphas = OnlyAlpha(input);
        sc.close();
        if(isPalindrome(alphas, 0)){
            System.out.println("This phrase is a palindrome. ");
        }
        else{
            System.out.println("This phrase is not a palindrome. ");
        }
    }
    public static boolean isPalindrome(String s, int idx){
        if(idx >= (s.length() - idx - 1)) return true;
        if(s.charAt(idx) != s.charAt((s.length() - idx - 1))) return false;
        return isPalindrome(s, ++idx);
    }
    public static String OnlyAlpha(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().trim().toLowerCase();
    }
}
