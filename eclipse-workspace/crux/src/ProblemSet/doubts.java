package ProblemSet;

import java.util.*;

public class doubts {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] array = new String[N];
		for (int i = 0; i < N; i++) {
			subSequence(scanner.next(), "");
		}
	}

	public static void subSequence(String unprocessed, String processed) {

		if (unprocessed.length() <= 1) {
			System.out.println(processed + unprocessed);
			return;
		}

		char ch = unprocessed.charAt(0);
		String str = unprocessed.substring(0, 2);

		if ("pi".equals(str)) {

			subSequence(processed + "3.14", unprocessed.substring(2));

		} else {
			subSequence(processed + ch, unprocessed.substring(1));
		}

	}
}