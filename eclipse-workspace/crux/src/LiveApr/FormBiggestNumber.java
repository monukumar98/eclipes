package LiveApr;

import java.util.Scanner;

public class FormBiggestNumber {

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
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (campare(arr[j], arr[j + 1])) {

						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}

				}
			}
			for (int val : arr) {
				System.out.print(val);
			}
			System.out.println();
		}
	}

	public static boolean campare(int n1, int n2) {
		String n1n2 = Integer.toString(n1) + Integer.toString(n2);
		String n2n1 = Integer.toString(n2) + Integer.toString(n1);
		long n1n2int = Long.parseLong(n1n2);
		long n2n1int = Long.parseLong(n2n1);
		if (n1n2int > n2n1int) {
			return false;
		} else
			return true;
	}

}
