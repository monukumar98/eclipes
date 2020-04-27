package Competitive;

import java.util.Scanner;

public class Pignhole_Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long arr[] = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			System.out.println(divisblesubarray(arr, n));
		}

	}

	public static long divisblesubarray(long arr[], int n) {
		long sum = 0;
		long pr[] = new long[n];
		pr[0] = 1;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum < 0) {
				pr[(int) ((sum % n + n) % n)]++;
			} else {
				pr[(int) (sum % n)]++;
			}

		}

		System.out.println();
		long fs = 0;
		for (int i = 0; i < pr.length; i++) {

			if (pr[i] >= 2) {
				fs += ((pr[i] * (pr[i] - 1)) / 2);
			}
		}
		return fs;

	}

}
