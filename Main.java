
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Main
{
    
    public static void main(String[] args ){
        int guess = 0;  //declare variable guess .
        int count = 0;  //declare counter
        int mysteryNumber = 15;   //this is the number trying to guess
        
        Scanner in = new Scanner(System.in);  // declare scanner
        System.out.println("Guess a number between 1 and 25.");
        do {
            System.out.println("What is your guess in whole numbers? "); //prompt user for number
            guess = in.nextInt();  //reads input and assigns to guess
            count++;
            if (guess > mysteryNumber) System.out.println("Too large");
            if (guess < mysteryNumber) System.out.println("Too small");
        } while (guess != mysteryNumber);
            
        System.out.println("Correct guess");
        System.out.println("It took " + count + " tries to guess the number.");
    
    }
    
}
