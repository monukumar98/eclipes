package LiveApr;

import java.util.Scanner;

public class PythagorasTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		// System.out.println(((n * n) / 4) + 1);
		if (n < 3) {
			System.out.println(-1);
		}
		if ((n & 1) == 1) {
			System.out.println((n * n - 1) / 2 + " " + (n * n + 1) / 2);
		} else {
			System.out.print((((n * n) / 4) - 1) + " ");// + " " + ((n * n) / 4) + 1);
			System.out.println(((n * n) / 4) + 1);
		}
	}

}
