import java.util.Scanner;
public class Hangman {
    private static int hanger = 0;
	private static String answer = new String(new char[WordList.getRandomWord().length()]).replace("\0", "*");
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
	   System.out.println(WordList.getRandomWord());
	   while (hanger < 7 && answer.contains("*")) {
		System.out.println("Guess a letter");
		System.out.println(answer);
		String guess = input.next();
		guess(guess);
	}
	input.close();
    }
    

    public static void guess(String guess) {
        String letter = "";
		for(int i = 0; i < WordList.getRandomWord().length(); i++) {
			if(WordList.getRandomWord().charAt(i) == guess.charAt(0)) {
				letter += guess.charAt(0);
			} else if(answer.charAt(i) != '*') {
				letter += WordList.getRandomWord().charAt(i);
			} else {
				letter += "*";
			}
		}
		if(answer.equals(letter)) {
			hanger++;
			hangman();
		} else {
			answer = letter;
		}
		if(answer.equals(WordList.getRandomWord())) {
			System.out.println("Correct! The word was " + WordList.getRandomWord());
		}
    }

    public static void hangman() {
		if (hanger == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (hanger == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (hanger == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (hanger == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (hanger == 5) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! The answer was ");
		}
    }

}