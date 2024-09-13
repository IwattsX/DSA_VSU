/*
 * Group Members: Isaac Watts, Hunter Smith, Albert Lluberes, Jhiron Hobbs 
 * Date: 09/13/2023
 * Description: Java program that simulates the Rock, Paper, Scissors game. 
 * It uses three methods:  userChoice, compChoice, and winner.
 */

// Import Random to access random method
import java.util.Random;
import java.util.Scanner;

public class rpsGame_group3 {
    public static void main(String[] args) {
        // declare scanner here so I can close it after I am done using the userChoice
        // function
        Scanner sc = new Scanner(System.in);

        String p1choice, p2choice;

        System.out.println("Enter the amount of times you want to play Rock, Paper, Scissors");
        if (!sc.hasNextInt()) {
            System.out.println("Error, must be an integer value");
            sc.close();
            return;
        }
        int plays = sc.nextInt();

        String[] p1wins = new String[plays];

        // Call userChoice
        for (int i = 0; i < plays; i++) {
            p1choice = userChoice(sc);
            p2choice = compChoice();

            System.out.println("Player 1 choice is " + p1choice);
            System.out.println();
            System.out.println("Player 2 choice is " + p2choice);
            System.out.println();
            System.out.println("The result of the game is " + winner(p1choice, p2choice, i, p1wins));
            System.out.println("__________________________");
        }

        for (int i = 0; i < p1wins.length; i++) {
            System.out.printf("Game %d: ", (i + 1));
            if (p1wins[i].equals("win")) {
                System.out.println("player 1 wins");
            } 
            else if (p1wins[i].equals("Tie")) {
                System.out.println("Tie");
            } 
            else if (p1wins[i].equals("loss")) {
                System.out.println("player 2 wins");
            }
        }
        sc.close();
    }

    public static String userChoice(Scanner myInput) {
        String uChoice;

        System.out.print("Enter rock, paper, or scissors: ");
        uChoice = myInput.next().toLowerCase();

        return uChoice;
    }

    public static String compChoice() {
        String[] choices = { "rock", "paper", "scissors" };
        Random random = new Random();
        int cChoice = random.nextInt(3);

        return choices[cChoice];

    }

    public static String winner(String p1c, String p2c, int idx, String[] p1Wins) {
        String won;

        // Check if player 1 wins
        if ((p1c.equals("rock") && p2c.equals("scissors")) || (p1c.equals("scissors") && p2c.equals("paper"))
                || (p1c.equals("paper") && p2c.equals("rock"))) {
            won = "Player 1 wins";
            p1Wins[idx] = "win";
        }

        // Check if there is a tie
        else if (p1c.equals(p2c)) {
            won = "Tie";
            p1Wins[idx] = "Tie";
        }

        // Player 2 wins
        else {
            won = "Player 2 wins";
            p1Wins[idx] = "loss";
        }

        return won;
    }
}