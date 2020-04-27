package Dynamicprogramming;

import java.util.HashMap;
import java.util.Scanner;

public class ExchangingCoins {
	static long dp[] = new long[1000000];
	static HashMap<Integer, Long> map = new HashMap<Integer, Long>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		map.put(0, 0l);
		System.out.println(result(n));

	}

	public static long result(int n) {
		if (n == 0) {
			return 0;
		}

		if (map.containsKey(n)) {
			return map.get(n);
		}

		map.put(n, Math.max(n, result(n / 2) + result(n / 3) + result(n / 4)));
		return map.get(n);

	}

}
