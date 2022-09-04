package WordleClone;

public class UserOutput {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void gameStart() {
        System.out.println();
        System.out.println("**********************************");
        System.out.println("*  Welcome to off-brand Wordle!  *");
        System.out.println("**********************************");
        System.out.println();
    }
    public static void gameMenu() {
        System.out.println("1. Start Game");
        System.out.println("2. Rules");
        System.out.println("3. Exit");
    }
    public static void rules() {
        System.out.println("**********************************");
        System.out.println("*             RULES              *");
        System.out.println("**********************************");
        System.out.println("Guess the WORDLE in 6 tries.\n" +
                "Each guess must be a valid 5-letter word. Hit the enter button to submit.\n" +
                "After each guess, the color of the tiles will change to show how close your guess was to the word.");
        System.out.println("\nExamples:\n" +
                (ANSI_GREEN + "W" + ANSI_RESET) + "EARY\n" +
                "The letter W is in the word and in the correct spot.\n" +
                "P" + (ANSI_YELLOW + "I" + ANSI_RESET) + "LLS\n" +
                "The letter I is in the word but in the wrong spot.\n" +
                "VAGUE"+
                "\nnone of the letters in 'vague' are in the word in any spot.");
    }
}
