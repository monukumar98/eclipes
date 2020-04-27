package ProblemSet;

public class Wave {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[0][2] = 13;
		arr[0][3] = 14;
		arr[1][0] = 21;
		arr[1][1] = 22;
		arr[1][2] = 23;
		arr[1][3] = 24;
		arr[2][0] = 31;
		arr[2][1] = 32;
		arr[2][2] = 33;
		arr[2][3] = 34;
		arr[3][0] = 41;
		arr[3][1] = 42;
		arr[3][2] = 43;
		arr[3][3] = 44;
		display(arr);
		//waveprint(arr);
		spiralanticlockwise(arr);
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void waveprint(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {

				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");

				}
			}
			System.out.println(" ");

		}
		System.out.println("*****");
	}

	public static void spiralanticlockwise(int[][] arr) {
		int top = 0;
		int left = 0;
		int right = arr[0].length - 1;
		int bottom = arr.length - 1;
		for (int i = left; i <= right; i++) {
			System.out.print(arr[top][i] + " ");
		}
	
		top = top + 1;
		for (int j = top; j <= bottom; j++) {
			System.out.print(arr[j][right]+" ");
		}
		right = right - 1;
		for (int k = right; k >= left; k--) {
			System.out.print(arr[bottom][k]+" ");
		}
		bottom = bottom - 1;
		for (int i = bottom; i > left; i--) {
			System.out.print(arr[i][left]+" ");
		}
		for (int i = top; i <= right; i++) {
			System.out.print(arr[top][i]+" ");
		}
		for (int i = right; i <= bottom; i++) {
			System.out.print(arr[i][bottom]+" ");
		}
		right = right - 1;
		for (int i = right; i >= top; i--) {
			System.out.print(arr[bottom][i]+" ");

		}

	}

}