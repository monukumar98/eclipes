package LiveApr;

import java.util.Scanner;

public class MatrixSerch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		for (int row = 0; row < n;) {
			for (int col = m - 1; col >= 0 && row < n;) {
				if (arr[row][col] == x) {
					System.out.println(1);
					return;
				} else if (arr[row][col] > x) {
					col--;
				} else {
					row++;
				}
			}
		}
		System.out.println(0);

	}

}