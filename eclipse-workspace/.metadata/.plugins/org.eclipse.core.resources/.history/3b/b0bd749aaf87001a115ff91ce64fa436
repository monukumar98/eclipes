package CodingBlocks;

import java.util.Scanner;

public class Doubt {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(prntanswer(str, str.length()-1));

	}

	public static int prntanswer(String str, int length) {
		if (str.length() == 0) {
			return 0;
		}
		char ch = str.charAt(0);
		return (ch - 48) * (int) (Math.pow(10, length)) + prntanswer(str.substring(1), length - 1);

	}

	public static long chew(long n) {
		long s = 0;
		int temp = 0;
		int place = 0;
		int p = 0;
		while (n > 9) {
			int r = (int) (n % 10);
			temp = 9 - r;
			// if (temp != 0) {
			p = Math.min(r, temp);
			// }
			// else
			// p = r;
			s = s + p * (long) (Math.pow(10, place));
			place++;
			n = n / 10;
		}
		if (n < 9) {
			int r = (int) (n % 10);
			temp = 9 - r;

			n = Math.min(r, temp);

		}
		s = s + n * (long) (Math.pow(10, place));

		return s;
	}
}