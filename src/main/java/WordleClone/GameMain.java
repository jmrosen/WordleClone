package WordleClone;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {

        Words.createWordList();
        Words wordList = new Words();
        Scanner userInput = new Scanner(System.in);

        while (true) {
            UserOutput.gameStart();
            UserOutput.gameMenu();
            String menuInput = userInput.nextLine();

            if (menuInput.equals("1")) {
                String answer = wordList.getAnswerWord();
                int numOfGuesses = 0;

                while (numOfGuesses < 6) {
                    System.out.println("Please enter your guess: ");
                    String guess = userInput.nextLine().toLowerCase();

                    boolean isValidGuess = Words.checkGuess(guess, answer);
                    if (isValidGuess) {
                        numOfGuesses++;
                    }
                    if (guess.equals(answer)) {
                        System.out.println("You got the correct word in " + numOfGuesses + " guess(es)!");
                        break;
                    }
                }
            } else if (menuInput.equals("2")) {
                UserOutput.rules();

            } else if (menuInput.equals("3")) {
                System.out.println("Thanks for playing!");
                break;

            } else {
                System.out.println("Please enter a valid input!");
            }
        }
    }
}
