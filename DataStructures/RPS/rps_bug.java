package DataStructures.RPS;

/*
 * Name: Denise Daniels 
 * Date: 09/13/2023
 * Description: Java program that simulates the Rock, Paper, Scissors game. 
 * It uses three methods:  userChoice, compChoice, and winner.
 */

// Import Random to access random method
import java.util.Random;
import java.util.Scanner;

public class rps_bug {
    public static void main(String[] args) {
        String p1choice, p2choice;

        // Call userChoice
        p1choice = userChoice();
        p2choice = compChoice();

        System.out.println("Player 1 choice is " + p1choice);
        System.out.println();
        System.out.println("Player 2 choice is " + p2choice);
        System.out.println();
        System.out.println("The result of the game is " + winner(p1choice,p2choice));

        
    }

    public static String userChoice() {
        Scanner myInput = new Scanner(System.in);
        String uChoice;

        System.out.print("Enter rock, paper, or scissors: ");
        uChoice = myInput.next();

        return uChoice; 
    }

    public static String compChoice() {
        Random random = new Random();
        String scChoice; 
        int cChoice = random.nextInt(3);

        if (cChoice == 0) {
            scChoice = "rock";
        }
        else if (cChoice == 1) {
            scChoice = "paper";
        }
        else {
            scChoice = "scissors"; 
        }

        return scChoice;

    }

    public static String winner(String p1c, String p2c) {
        String won;

        // Check if player 1 wins
        if ((p1c == "rock" && p2c == "scissors") || (p1c == "scissors" && p2c == "paper") 
        || (p1c == "paper" && p2c == "rock")) {
            won = "Player 1 wins";
        }

        // Check if there is a tie
        else if (p1c == p2c) {
            won = "Tie"; 
        }

        // Player 2 wins
        else {
            won = "Player 2 wins";
        }

        return won; 
    }
}