package Dynamicprogramming;

import java.util.Scanner;

public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int wine[] = new int[n];
		for (int i = 0; i < n; i++) {
			wine[i] = sc.nextInt();
		}
		int dp[][] = new int[1000][1000];
		System.out.println(Wine(wine, 0, wine.length - 1, 1, dp));

	}

	public static int Wine(int[] wine, int i, int j, int year, int[][] dp) {
		// TODO Auto-generated method stub
		if (i > j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int ans = Math.max(wine[i] * year + Wine(wine, i + 1, j, year + 1, dp),
				wine[j] * year + Wine(wine, i, j - 1, year + 1, dp));
		return ans;
//		int op1 = wine[i]*year + Wine(wine, i+1, j, year+1);
//		int op2 = wine[j]*year + Wine(wine, i, j-1, year+1);
//		return Math.max(op1, op2);

	}

}
