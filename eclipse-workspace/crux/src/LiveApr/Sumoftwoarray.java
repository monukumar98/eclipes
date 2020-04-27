package LiveApr;

import java.util.ArrayList;
import java.util.Scanner;

public class Sumoftwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr1[] = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		int i = arr.length - 1;
		int j = arr1.length - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = 0;
			if (i >= 0) {
				sum += arr[i];
				i--;
			}
			if (j >= 0) {
				sum += arr1[j];
				j--;
			}
			sum += carry;
			list.add(0, sum % 10);
			carry = sum / 10;

		}
		for (i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println("END");
	}

}
