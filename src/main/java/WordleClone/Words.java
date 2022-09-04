package WordleClone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Words {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    static File answerFile = new File("word-list.txt");
    Random rand = new Random();
    static List<String> wordList = new ArrayList<>();

    public static List<String> createWordList() {
            try {
                Scanner answerScanner = new Scanner(answerFile);
                while (answerScanner.hasNextLine()) {
                    String line = answerScanner.nextLine();
                    wordList.add(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Could not find answer file!");
            }
        return wordList;
    }

    public String getAnswerWord() {
        String answerWord = wordList.get(rand.nextInt(wordList.size()));
        return answerWord;
    }

    public static boolean checkGuess(String guess, String answer) {
        if (wordList.contains(guess)) {
            for (int i = 0; i < 5; i++) {
                char checkChar = guess.charAt(i);
                if (checkChar == answer.charAt(i)) {
                    System.out.print(ANSI_GREEN +String.valueOf(guess.charAt(i)).toUpperCase() + ANSI_RESET);
                } else if (answer.contains(String.valueOf(checkChar))) {
                    System.out.print(ANSI_YELLOW + String.valueOf(guess.charAt(i)).toUpperCase() + ANSI_RESET);
                } else if (!answer.contains(String.valueOf(checkChar))) {
                    System.out.print(String.valueOf(guess.charAt(i)).toUpperCase());
                }
            }
            System.out.println();
            return true;
        } else {
            System.out.println("Please enter a valid guess!");
            return false;
        }
    }
}
