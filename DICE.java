/*
 * This program runs the BASIC Dice
 * game in Java
 *
 * @author Amanda Benjamin
 * @version 1.0
 * @since Oct 1 2024
 */

	import java.util.Scanner;
	import java.util.Random;

/**
 * This is the BASIC DICE game
 */

import java.util.Scanner;
import java.util.Random;

final class DICE {
	/**
	 * Prevent instantiation.
	 * Throw an exception IllegalStateException.
	 * if this is ever called
	 *
	 * @throws IllegalStateException if this is ever called
	 *
	 *
	 */
	private DICE() {
		throw new IllegalStateException("Cannot be instantiated");
	}

	/**
	* The starting main() function.
	*
	* @param args No args will be used
	*/

	import java.util.Scanner;
	import java.util.Random;

    public static void main(final String[] args) {

		Scanner scanner = new Scanner(System.in)
		Random random = new Random();

    	System.out.println("THIS PROGRAM SIMLUATES THE ROLLING OF A");
        System.out.println("PAIR OF DICE.");
        System.out.println("YOU ENTER THE NUMBER OF TIMES YOU WANT THE COMPUTER");
        System.out.println("TO 'ROLL' THE DICE. WATCH OUT, VERY LARGE NUMBERS TAKE");
        System.out.println("A LONG TIME, IN PARTICULAR, NUMBERS OVER 5000");

		String useranswer = "YES";

		int[] frequency = new int[13];

		if (useranswer.equalsIgnoreCase("YES") || useranswer.equalsIgnoreCase("Y")) {
		System.out.print("HOW MAY ROLLS: ");
		int rollamount = scanner.nextInt();

			for (int counter = 0; counter < rollamount; counter++) {
				int firstdie = random.nextInt(6) + 1;
				int seconddie = random.nextInt(6) + 1;
				int total = firstdie + seconddie;
				frequency[total]++;
			}

			for (int amountcounter = 0; amountcounter <=12: amountcounter++) {
				System.out.println("TOTAL SPOTS" + amountcounter + "NUMBER OF TIMES" + frequency[amountcounter]);
			}

			System.out.print("TRY AGAIN? ");
			useranswer = scanner.nextLine();
    	} else {
			System.out.println("\nDone.");
		}
	}
}