package Dynamicprogramming;

import java.util.Scanner;

public class MoneyChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int m = sc.nextInt();
			int money[] = new int[m];
			for (int i = 0; i < m; i++) {
				money[i] = sc.nextInt();
			}
			int n = sc.nextInt();
			int dp[][] = new int[1000005][501];
			System.out.println(moneychanges(money, n, 0, dp));
		}
	}

	public static int moneychanges(int[] money, int n, int i, int[][] dp) {
		if (n == 0) {
			return 1;
		}
		
    
		if (n < 0) {
			return 0;
		}
		if (i == money.length && n >= 1) {
			return 0;
		}
		if (dp[n][i] != 0) {
			return dp[n][i];
		}
		return dp[n][i] = ((moneychanges(money, n - money[i], i, dp)) % (1_0000_000_00 + 7)
				+ (moneychanges(money, n, i + 1, dp)) %( 1_0000_000_00 + 7))%1000000007;

	}
}
