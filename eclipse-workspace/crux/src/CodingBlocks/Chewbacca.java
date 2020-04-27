package CodingBlocks;

import java.util.*;

public class Chewbacca {
	public static void main(String args[]) {
		// Your Code Here

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		long multi = 1;
	
		while (n > 9) {
			long rem = n % 10;
			long t = 9 - rem;
			if (rem > t) {
				ans = ans + t * multi;

			}

			else {
				ans = ans + rem * multi;
			}
			multi = multi * 10;
			n /= 10;

		}

		if (n != 9) {

			int temp = (int) (9 - n);

			if (temp < n) {
				n = temp;
			}
		}

		ans = ans + n * multi;

		System.out.print(ans);

	}
}