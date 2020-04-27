package LiveApr;

import java.util.*;
import java.util.*;
import java.lang.*;
import java.io.*;



public class BostonNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1;
		if (sumof(n) == isboston(n)) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
	}

	public static int sumof(int n) {
		int count = 0;
		while (n != 0) {
			int rem = n % 10;
			count = count + rem;
			n = n / 10;
		}
		return count;
	}

	public static boolean isPrime(int n) {
		int factors = 0, i;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) // ensure that you mod n not i
				factors++;
		}

		if (factors == 2)
			return true;
		else
			return false;
	}

	public static int isboston(int n) {
		int b = sumof(n);
		int sqt = (int) Math.pow(n, 0.5);
		int count = 0, i;
		while (n % 2 == 0) {
			count = count + 2;
			n = n / 2;
		}
		if (n % 2 != 0) {
			for (i = 3; i <= sqt; i += 2) {

				while (n % i == 0) {
					count = count + sumof(i);
					n = n / i;
				}

			}
			if (n > 2 && isPrime(n)) {

				count = count + sumof(n);

			}

		}
		return count;

	}
}
