package LiveApr;

import java.util.Scanner;

public class SortinLinerTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int arr[]) {
		int lo = 0;
		int mid = 0;
		int hi = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[mid] == 1) {
				mid++;

			} else if (arr[mid] == 2) {
				int t = arr[hi];
				arr[hi] = arr[mid];
				arr[mid] = t;
				hi--;

			} else {
				int t = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = t;
				lo++;
				mid++;
			}
		}

	}

}
