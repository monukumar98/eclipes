package CodingBlocks;

import java.util.*;
import java.util.LinkedList;

public class WindowSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			windowProblem(arr, k);
			System.out.println();

		}

	}

	public static void windowProblem(int arr[], int k) {
		LinkedList<Integer> q = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				q.addLast(i);
			}
		}
		for (int i = k; i < arr.length; i++) {
			if (!q.isEmpty()) {
				System.out.print(arr[q.peek()] + " ");

			} else {
				System.out.println(0);
			}
			while (!q.isEmpty() && q.peek() <= i - k) {
				q.removeFirst();

			}
			if (arr[i] < 0) {
				q.addLast(i);

			}
		}
		if (!q.isEmpty()) {
			System.out.print(arr[q.peek()] + " ");

		} else {
			System.out.print(0);
		}

	}
}
