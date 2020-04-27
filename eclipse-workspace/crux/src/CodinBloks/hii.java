package CodinBloks;

import java.util.*;

public class hii {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int star1 = n;
		String s1 = "Suzy";
		String s2 = "Alice";
		System.out.println(s2.compareTo(s1));
		int row = 1;
		while (row <= n) {
			int col = 1;
			if (row == 1 || row == n) {

				col = 1;
				while (col <= star1) {

					System.out.print("*\t");
					col++;
				}
			} else if (row % 2 == 0) {
				col = 1;
				int star2 = 2;
				while (col <= star2) {

					System.out.print("*\t");
					col++;
				}

				col = 1;
				int space = 1;
				while (col <= space) {

					System.out.print("\t");
					col++;
				}

				col = 1;
				int star3 = 2;
				while (col <= star3) {

					System.out.print("*\t");
					col++;

				}

			}

			else if (row % 2 != 0 && row != 1 && row != n) {

				col = 1;
				int star4 = 1;
				while (col <= star4) {

					System.out.print("*\t");
					col++;

				}

				col = 1;
				int space2 = 3;
				while (col <= space2) {

					System.out.print("\t");
					col++;
				}

				col = 1;
				int star5 = 1;
				while (col <= star5) {

					System.out.print("*\t");
					col++;
				}

			}

			System.out.println(" ");
			row++;

		}

	}
}