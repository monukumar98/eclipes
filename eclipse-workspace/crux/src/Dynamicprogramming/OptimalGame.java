package Dynamicprogramming;

import java.util.Scanner;

public class OptimalGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int dp[][] = new int[n + 5][n + 5];
		System.out.println(OptimalGame(arr, 0, arr.length - 1, dp));
	}

	public static int OptimalGame(int[] arr, int i, int j, int[][] dp) {
		if (i >= j) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		if (j == i + 1) {
			return dp[i][j] = Math.max(arr[j], arr[i]);
		} else {
			int fn = Math.max(arr[i] + Math.min(OptimalGame(arr, i + 2, j, dp), OptimalGame(arr, i + 1, j - 1, dp)),
					arr[j] + Math.min(OptimalGame(arr, i + 1, j - 1, dp), OptimalGame(arr, i, j - 2, dp)));
			return dp[i][j] = fn;
		}
	}

	public static int OptimalGame(int[] arr, int i, int j) {
		if (i >= j) {
			return 0;
		}
		if (j == i + 1) {
			return Math.max(arr[j], arr[i]);
		} else {
			int fn = Math.max(arr[i] + Math.min(OptimalGame(arr, i + 2, j), OptimalGame(arr, i + 1, j - 1)),
					arr[j] + Math.min(OptimalGame(arr, i + 1, j - 1), OptimalGame(arr, i, j - 2)));
			return fn;
		}
	}

	
}
