package Bitmasking;

import java.util.*;

public class UniqueNumberI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = arr[0];
		for (int i=1; i<arr.length; i++) {
			ans ^= arr[i];
		}
		System.out.println(ans);

	}

}
