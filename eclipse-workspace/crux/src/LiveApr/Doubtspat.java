package LiveApr;

import java.util.Scanner;

public class Doubtspat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num = sc.nextLong();

		long[] sep = new long[18];
		int count = 0;
		int j = 0;
		for (int i = 0; i < 18; i++) {
			if (num % 10 != 0) {
				sep[j] = num % 10;
				num = num / 10;
				count++;
				j++;
			} else
				num = num / 10;
		}
		for (int i = 0; i < count - 1; i++) {
			if (sep[i] == 9)
				sep[i] = 0;
		}
		for (int i = 0; i < count; i++) {
			if (sep[i] >= 5 && sep[i] < 9) {
				sep[i] = 9 - sep[i];

			}

		}

		for (int i = count - 1; i >= 0; i--) {

			System.out.print(sep[i]);
		}

	}

}