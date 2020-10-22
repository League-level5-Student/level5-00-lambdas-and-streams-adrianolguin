package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String message = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				message += s.charAt(i);
			}
			System.out.println(message);
		}, "Backwards message?");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			Random rand = new Random();
			String message = "";
			for (int i = 0; i < s.length(); i++) {
				if (rand.nextBoolean()) {
					message += Character.toUpperCase(s.charAt(i));
				} else {
					message += Character.toLowerCase(s.charAt(i));
				}
			}
			System.out.println(message);
		}, "Random Capitals, ahh!");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String message = "";
			for (int i = 0; i < s.length(); i++) {
				message += s.charAt(i);
				message += ".";
			}
			System.out.println(message);
		}, "This is definitely gramatically incorrect");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			String message = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a' || 
					s.charAt(i) == 'e' || 
					s.charAt(i) == 'i' || 
					s.charAt(i) == 'o' || 
					s.charAt(i) == 'u') {
				} else {
					message += s.charAt(i);
				}
			}
			System.out.println(message);
		}, "What is this? It's like I have a lisp");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
