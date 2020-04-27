package LiveApr;

import java.util.Scanner;

public class CBnumber {
	static int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		boolean[] ans = new boolean[n];
		int c = 0;
		for (int len = 1; len <= str.length(); len++) {
			for (int si = 0; si <= str.length() - len; si++) {
				int ei = si + len;
				if (iscbnumber(Long.valueOf(str.substring(si, ei))) && visited(ans, si, ei - 1)) {
					c++;
					for (int i = si; i < ei; i++) {
						ans[i] = true;
					}

				}

			}
		}
		System.out.println(c);

	}

	public static boolean visited(boolean ans[], int i, int j) {
		for (; i <= j; i++) {
			if (ans[i]) {
				return false;
			}
		}
		return true;

	}

	public static boolean iscbnumber(long n) {
		if (n == 0 || n == 1) {
			return false;

		}
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
