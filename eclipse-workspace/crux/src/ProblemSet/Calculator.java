package ProblemSet;

import java.util.Scanner;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// System.out.println("Enter operation");
		while (true) {
			char ch = s.next().charAt(0);
			if (ch == 'X' || ch == 'x') {
				System.exit(0);
			}
			calc(ch);
		}
		

	}

	public static void calc(char ch) {
		Scanner s = new Scanner(System.in);
//
//		if (ch == 'X' || ch == 'x') {
//			System.exit(0);
//		} else
		if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
			// System.out.println("enter the two values");
			long a = s.nextLong();
			long b = s.nextLong();
			long result = calculator(a, b, ch);
			System.out.println(result);
		} else {
			System.out.println("Invalid operation. Try again.");

			char c = s.next().charAt(0);
			calc(c);
		}

	}

	public static long calculator(long a, long b, char ch) {
		long result = 0;
		if (ch == '+')
			result = a + b;
		else if (ch == '-')
			result = a - b;
		else if (ch == '*')
			result = a * b;
		else if (ch == '/')
			result = a / b;
		else if (ch == '%')
			result = a % b;
		return result;

	}
}