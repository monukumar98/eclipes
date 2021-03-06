package LiveApr;

import java.util.Scanner;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int minc = 0;
		int minr = 0;
		int maxc = arr[0].length-1;
		int maxr = arr.length-1;
		int count = 1;
		while (count <= m * n) {
			// first row
			for (int i = minc; i <= maxc && count <= n * m; i++) {
				System.out.print(arr[minr][i] + ", ");
				count++;
			}
			minr++;
			// last col
			for (int i = minr; i <= maxr && count <= n * m; i++) {
				System.out.print(arr[i][maxc] + ", ");
				count++;
			}
			maxc--;
			// last row
			for (int i = maxc; i >= minc && count <= n * m; i--) {
				System.out.print(arr[maxr][i] + ", ");
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < m * n; i--) {
				System.out.print(arr[i][minc]+", ");
				count++;
			}
			minc++;
		}
		System.out.print("END");
	}

}
