
import java.util.Scanner;

public class GuessingGame
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        int a = 1 + (int) (Math.random() * 9);
        int guess;

        System.out.println("I am thinking about a number between 1 and 10...\n" +
                "Can you guess it? ?");
        guess = keyboard.nextInt();

        while(guess != a){
            if (guess > a)
            {
                System.out.println("It is too low. Guess Again");

            }
            else if (guess < a)
            {
                System.out.println("It it too high. Guess Again");

            }
            else
            {
                System.out.println("That's right! You are a good guesser.");
            }
        }
    }
}