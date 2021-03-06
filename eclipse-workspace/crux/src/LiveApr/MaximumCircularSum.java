package LiveApr;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int ans[] = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				ans[i] = arr[i];
				ans[arr.length + i] = arr[i];
			}
			long result = Long.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				long sum = 0;
				for (int j = i; j < arr.length + i; j++) {
					sum += ans[j];
					result = Math.max(sum, result);

				}
			}
			System.out.println(result);

		}

	}
}
