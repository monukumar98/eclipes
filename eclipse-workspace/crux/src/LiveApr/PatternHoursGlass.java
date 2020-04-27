package LiveApr;

import java.util.*;

public class PatternHoursGlass {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1, nst = 2 * n + 1, nsp = 0, val = n;
		while (row <= 2 * n + 1) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 1;

			while (cst <= nst) {
				if (cst <= nst / 2) {
					System.out.print(val + " ");
					val--;
				} else {
					System.out.print(val + " ");
					val++;
				}
				cst++;
			}

			if (row <= n) {

				nst -= 2;
				nsp++;
				val--;
			} else {
				nst += 2;
				nsp--;
				val++;
			}
			val--;
			row++;
			System.out.println();
		}

	}
}
