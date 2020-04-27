package LiveApr;

import java.util.Scanner;

public class UniqueNumbersII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];
		}
		int z = ans & ~(ans - 1);
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & z) == 0) {
				a ^= arr[i];
			}
		}
		int b = ans ^ a;
		if (a > b) {
			System.out.println(b + " " + a);
		} else {
			System.out.println(a + " " + b);
		}
	}

}
