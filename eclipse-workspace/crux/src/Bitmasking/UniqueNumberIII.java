package Bitmasking;

import java.util.Scanner;

public class UniqueNumberIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(uniquenoIII(arr));

	}

	public static int uniquenoIII(int arr[]) {
		int cn[] = new int[32];
		for (int i = 0; i < arr.length; i++) {
			int j = 0;
			while (arr[i] > 0) {
				int last_bit = arr[i] & 1;
				cn[j] = last_bit;
				arr[i] >>= 1;
				j++;
			}
		}
		int sum = 0;

		for (int i = 0; i < 32; i++) {
			cn[i] = cn[i] % 3;
			sum += cn[i] * Math.pow(2, i);

		}

		return sum;
	}

}
