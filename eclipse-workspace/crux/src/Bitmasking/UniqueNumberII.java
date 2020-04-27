package Bitmasking;

import java.util.Scanner;

public class UniqueNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			ans ^= arr[i];
		}
		int temp = ans;
		int pos = 0;
		temp = temp & ~(temp - 1);
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & temp) > 0) {
				a ^= arr[i];
			}
		}
		int b = a ^ ans;
		if (a > b) {
			System.out.println(b + " " + a);
		} else {
			System.out.println(a + " " + b);
		}
	}

}
