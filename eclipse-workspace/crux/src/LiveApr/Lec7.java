package LiveApr;

public class Lec7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[6][];
		int ans[] = new int[9];
		int i;
		// System.out.println(i);
		System.out.println(arr[0]);
		System.out.println(ans);
		System.out.println(ans);

	}

	public static void spiralDisplay(int[][] arr) {

		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;

		int count = 0;
		int nel = arr.length * arr[0].length;

		while (count < nel) {
			// first col
			for (int row = minRow; row <= maxRow && count < nel; row++) {
				System.out.print(arr[row][minCol] + " ");
				count++;
			}
			minCol++;

			// last row
			for (int col = minCol; col <= maxCol && count < nel; col++) {
				System.out.print(arr[maxRow][col] + " ");
				count++;
			}
			maxRow--;

			// last col
			for (int row = maxRow; row >= minRow && count < nel; row--) {
				System.out.print(arr[row][maxCol] + " ");
				count++;
			}
			maxCol--;

			// first row
			for (int col = maxCol; col >= minCol && count < nel; col--) {
				System.out.print(arr[minRow][col] + " ");
				count++;
			}
			minRow++;

		}

	}

}
