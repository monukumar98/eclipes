package ProblemSet;

import java.util.Scanner;

public class PrateekCandy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] ar = new int[t];
		for (int i = 0; i < t; i++) {
			ar[i] = s.nextInt();
		}
		helpPrateek(ar);
	}

	public static void helpPrateek(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int res = genPrime(ar[i]);
			System.out.println(res);
		}
	}

	public static int genPrime(int n) {
		if (n == 1) {
			return 2;
		}
		int c = 1;
		int i = 3;
		for (; i <= 1000000; i += 2) {
			boolean prime = checkPrime(i);
			if (prime) {
				c++;
			}
			if (c == n) {
				return i;
			}
		}
		return i;
	}

	public static boolean checkPrime(int n) {

		if (n == 2)
			return true;
		if (n % 2 == 0 || n < 2) {
			return false;

		}
		for (int i = 3; i * i <= n; i = i + 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}