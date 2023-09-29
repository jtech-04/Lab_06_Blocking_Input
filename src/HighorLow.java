import java.util.Scanner;
import java.util.Random;
public class HighorLow
{
    public static void main(String[] args)
    {
        boolean done = false;
        int answer;
        int guess = 0;
        final int MAX = 10;
        String trash = "";

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        answer = rand.nextInt(MAX) + 1;

        do {
            System.out.println("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();

                if (guess >= 1 && guess <= 10){

                    if (guess > answer) {
                        System.out.println("You guessed " + guess + " which is too high!");
                        System.out.println("The number was " + answer);

                        done = true;
                    } else if (guess < answer) {
                        System.out.println("You guessed " + guess + " which is too low!");
                        System.out.println("The number was " + answer);

                        done = true;

                    } else {
                        System.out.println("You guessed correctly!");
                        System.out.println("The number was " + answer);

                        done = true;
                    }
                }

                else
                {
                    System.out.println("You guessed: " + guess);
                    System.out.println("But that is not in the range of [1 - 10]. Please try again.");

                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You guessed " + trash);
                System.out.println("Please try again ad enter a number within range [1 - 10].");
            }


        }while(!done);
    }
}
