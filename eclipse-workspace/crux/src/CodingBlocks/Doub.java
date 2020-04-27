package CodingBlocks;

import java.util.*;

public class Doub {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int k = s.nextInt();
		int st = s.nextInt();
		char[][] str = new char[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				str[i][j] = s.next().charAt(0);
			}
		}

		// System.out.println(str[i]);
		boolean flag = false;

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {

				if (st < k) {
					flag = true;
					break;
				}

				else if (str[i][j] == '*') {
					st = st + 5;
				}
				else if (str[i][j] == '.') {
					st = st - 2;
				}
				else if (str[i][j] == '#') {
					break;
				}
				if (j < m - 1)
					st--;

			}
		}

		if (!flag) {
			System.out.println("Yes");
			System.out.println(st);
		} else {
			System.out.println("No");
		}
	}
}
