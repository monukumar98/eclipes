package ProblemSet;

import java.util.*;

public class AddStar {
	public static void main(String args[]) {
		partionWithStar("", "helll");
	}

	public static void partionWithStar(String processed, String unprocessed) {
		if (unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		if (unprocessed.length() == 1) {
			processed += unprocessed.substring(0);
			System.out.println(processed);
			return;
		}
		char ch = unprocessed.charAt(0);
		if (unprocessed.length() >= 2) {
			char ch1 = unprocessed.charAt(1);
			if (ch == ch1) {
				partionWithStar(processed + ch + "*", unprocessed.substring(1));

			} else {
				partionWithStar(processed + ch, unprocessed.substring(1));
			}
		}
	}
}