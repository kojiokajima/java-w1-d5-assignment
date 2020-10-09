import java.lang.Math;
import java.util.Scanner;

public class MathGame2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello and welcome to the two player math game, would you like to play? (y/n)");

        String userChoice = input.nextLine();

        int player1Lives = 3;
        int player2Lives = 3;
        int answer = -1;
        int playerNum = 1;
        
        
        if (userChoice.equals("Y") || userChoice.equals("y")) {
            System.out.println("You each have 3 lives");
            
            do {
                int num1 = (int)(Math.random() * 101);
                int num2 = (int)(Math.random() * 101);
                
                if (playerNum == 1) {
                    // Player 1 to Player 2
                    System.out.println("Player 1: what is " + num1 + " + " + num2);
                    answer = input.nextInt();
                    if (answer == num1 + num2) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Incorrect! The answer was " + (num1 + num2));
                        player2Lives--;
                    }
                    System.out.println("The lives: Player 1: " + player1Lives + "/3 Player 2: " + player2Lives + "/3");
                    playerNum = 2;
                } else if (playerNum == 2) {
                    // Player 2 to Player 1
                    num1 = (int)(Math.random() * 101);
                    num2 = (int)(Math.random() * 101);
                    System.out.println("Player 2: what is " + num1 + " + " + num2);
                    answer = input.nextInt();
                    if (answer == num1 + num2) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Incorrect! The answer was " + (num1 + num2));
                        player1Lives--;
                    }
                    System.out.println("The lives: Player 1: " + player1Lives + "/3 Player 2: " + player2Lives + "/3");
                    playerNum = 1;
                }
            } while(player1Lives > 0 && player2Lives > 0);

            if (player1Lives == 0) {
                System.out.println("Player 2 wins!");
            } else {
                System.out.println("Player 1 wins!");
            }
        }

    }
}