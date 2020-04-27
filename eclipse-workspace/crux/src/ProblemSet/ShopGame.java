package ProblemSet;

import java.util.Scanner;

public class ShopGame {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int phoneCounter = 1;
			int m = sc.nextInt();
			int n = sc.nextInt();
			while (true) {
				// if (m 1 - phoneCounter >= 0) {
				m = m - phoneCounter;
				// } else {
				if (m < 0) {
					System.out.println("Harshit");
					break;
				}
				phoneCounter += 1;
				// if (n - phoneCounter >= 0) {
				// } else {
				n = n - phoneCounter;
				if (n < 0) {
					System.out.println("Aayush");
					break;
				}
				phoneCounter += 1;
			}

		}

	}
}
