
package omt.numberguessinggame;

import java.util.Scanner;

/**
 * This is our simple number guessing game.
 * 
 * @author omt
 */
public class Game {
    static void startGame() {
        println("--- Number Guessing Game ---");
        // 1. Get the number (randomly choosen)
        // 2. Loop till not done
        // 3. Enter the guess
        // 4. Compare and provide feedback
        // 5. If found say congrats and exit
        int number, guess; 
        int max = 1000;
        int cntr = 0;
        boolean done = false;
        Scanner input = new Scanner(System.in); // Stream input needed here!
        
        number =  (int)(max*Math.random()) + 1; // Rnd val [0, 1)*max

        while (!done) {
            println("Please enter your guess (between 1 - 1000): ");
            guess = input.nextInt();
            cntr++;
            
            if (guess == number) {
                println("Bravo, you guessed it right!");
                println("You have guessed it in " + cntr + " steps");
                done = true;
            }
            else if (guess < number) {
                println("Actual number is higher");
            }
            else {
                println("Actual number is lower");
            }
        }
        
        println("Thanks for playing. Bye bye now.");
    }
    
    public static void main(String[] args) {
        startGame();
    }
    
    static void println(String msg) {
        System.out.println(msg);
    }
 
}
