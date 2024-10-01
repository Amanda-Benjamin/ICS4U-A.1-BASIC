/*
 * This program runs the BASIC Dice
 * game in Java
 *
 * @author Amanda Benjamin
 * @version 1.0
 * @since Oct 1 2024
 */

/**
 * This is the BASIC DICE game
 */
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
    public static void main(final String[] args) {

        // print out Game Introduction
        System.out.println("THIS PROGRAM SIMLUATES THE ROLLING OF A");
        System.out.println("PAIR OF DICE.");
        System.out.println("YOU ENTER THE NUMBER OF TIMES YOU WANT THE COMPUTER");
        System.out.println("TO 'ROLL' THE DICE. WATCH OUT, VERY LARGE NUMBERS TAKE");
        System.out.println("A LONG TIME, IN PARTICULAR, NUMBERS OVER 5000");

        

        System.out.println("\nDone.");
    }
}