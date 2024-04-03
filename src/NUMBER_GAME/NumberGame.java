package NUMBER_GAME;
import java.util.*;

public class NumberGame {


    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int attemptMax= 5;//setting attempts to maximum of 5
    int score=0;

        System.out.println("\t>>>WELCOME TO NUMBER GAME<<<");
        boolean playAgain = true;

        while (playAgain){
            int attempts=0;
            int randomNumber= random.nextInt(10)+1;
            boolean correctGuess= false;//initialised to false, so we can change to true when the user guesses the correct number

            //
            while (attempts<attemptMax &&!correctGuess) {
                System.out.println("Guess the number between range of 1 and 10..\nEnter the number below!");
                 int number = input.nextInt();
                 attempts++;

                 //comparing the user's number and the generated number to give relevant feedback
                if (number == randomNumber) {
                    correctGuess=true;
                    System.out.println("Congratulation! you made the correct guess\n");
                    score =score +2;

                } else if (number<randomNumber) {
                    System.out.println("too low,try again\n");

                } else {
                    System.out.println("too high,try again\n");

                }
            }

            if (!correctGuess){
                System.out.println("Unfortunately you ran out of attempts.");
                System.out.println("correct number was " + randomNumber+"\n\n");
            }

            //displaying score
            System.out.println("Your current score: " + score );
            System.out.print("Do you wish to play again? (yes/no): ");
            String choice = input.next().toLowerCase();
            playAgain = choice.equals("yes") ;
            //if user doesn't enter "yes" playAgain will be set to 'false' and while loop won't continue
        }
        System.out.println("\n\n");
        System.out.println("thank you for playing,hope you enjoyed");
    }
}
