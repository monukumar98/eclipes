package ProblemSet;

import java.util.*;

public class Candylove {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int i = 2;
			int count = 0;
			while (count < n) {
				if (isprime(i)) {
					count++;
				}
				if (count == n - 1) {
					System.out.println(i);
					break;
				}
				i++;
			}
		}
	}

	public static boolean isprime(int n) {
		if(n==2) {
			return true;
		}
		if (n < 2 || n % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}