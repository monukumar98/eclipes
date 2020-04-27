package ProblemSet;

import java.util.Scanner;

public class subarray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int fs = -1;
			int fe = -1;
			int maxLength = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr.length; j++) {

					if (equal101(arr, i, j)) {
						int ps = j - i + 1;
						if (ps > maxLength) {
							fs = i;
							fe = j;
							maxLength = ps;
						}
					}
				}
			}
			if (fs == -1 && fe == -1) {
				System.out.println("None");
			} else {
				System.out.println(fs + " " + fe);
			}
			test--;
		}
	}

	public static boolean equal101(int arr[], int si, int ei) {
		int no0 = 0;
		int no1 = 0;
		for (int i = si; i <= ei; i++) {
			if (arr[i] == 0) {
				no0++;
			} else {
				no1++;
			}
		}
		if (no0 == no1) {
			return true;
		} else {
			return false;
		}
	}

}