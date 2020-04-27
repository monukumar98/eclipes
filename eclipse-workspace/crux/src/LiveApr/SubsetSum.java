package LiveApr;

import java.util.Scanner;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			if (issumzero(arr, 0, 0, false)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

	public static boolean issumzero(int arr[], int i, int sum, boolean isitconsider) {

		if (i==arr.length) {

			if (sum == 0 && isitconsider) {
				return true;
			} else {
				return false;
			}
		}

		if (sum == 0 && isitconsider) {
			return true;
		}
		boolean include_answer = issumzero(arr, i + 1, sum + arr[i], true);
		boolean exclude_answer = issumzero(arr, i + 1, sum, isitconsider);
		return include_answer || exclude_answer;
	}

}
