/*
 * This program runs the BASIC Dice
 * game in Java
 *
 * @author Amanda Benjamin
 * @version 1.0
 * @since Oct 1 2024
 */

/**
 * This is the BASIC Dice game
 */

import java.util.Random;
import java.util.Scanner;

final class Dice {
	/**
	 * Prevent instantiation.
	 * Throw an exception IllegalStateException.
	 * if this is ever called
	 *
	 * @throws IllegalStateException if this is ever called
	 *
	 *
	 */
	private Dice() {
		throw new IllegalStateException("Cannot be instantiated");
	}

	/**
	* The starting main() function.
	*
	* @param args No args will be used
	*/

    public static void main(final String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean retry = true;

		while (retry) {
			System.out.println("\nTHIS PROGRAM SIMULATES THE ROLLING OF A");
			System.out.println("PAIR OF DICE.");
			System.out.println("YOU ENTER THE NUMBER OF TIMES YOU WANT THE COMPUTER");
			System.out.println("TO 'ROLL' THE DICE. WATCH OUT, VERY LARGE NUMBERS TAKE");
			System.out.println("A LONG TIME, IN PARTICULAR, NUMBERS OVER 5000\n");

			System.out.print("HOW MANY ROLLS: ");
			int rollamount = scanner.nextInt();
			scanner.nextLine(); // Consume newline left-over

			int[] frequency = new int[13];

			for (int counter = 0; counter < rollamount; counter++) {
				int firstdie = random.nextInt(6) + 1;
				int seconddie = random.nextInt(6) + 1;
				int total = firstdie + seconddie;
				frequency[total]++;
			}

			for (int amountcounter = 0; amountcounter <= 12; amountcounter++) {
				System.out.println("TOTAL SPOTS " + amountcounter + "        NUMBER OF TIMES " + frequency[amountcounter]);
			}

			System.out.print("\nTRY AGAIN? (YES/NO): ");
			String useranswer = scanner.nextLine();
			scanner.close();

			if (useranswer.equalsIgnoreCase("YES") || useranswer.equalsIgnoreCase("Y")) {
				retry = true;
			} else {
				retry = false;
			}
		}
	}
}
