package LiveApr;

import java.util.Scanner;

public class AllIndicesProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int item = sc.nextInt();
		int ans[] = AllIndex(arr, item, 0, 0);
		for (int val : ans) {
			System.out.print(val + " ");
		}

	}

	public static int[] AllIndex(int[] arr, int item, int i, int c) {
		if (i == arr.length) {
			int ans[] = new int[c];
			return ans;

		}
		if (arr[i] == item) {
			int res [] = AllIndex(arr, item, i+1, c+1);
			res [c]=i;
			return res;
		}
		else {
			int res [] = AllIndex(arr, item, i + 1, c);
			return res;
		
		}
		
	}

}
