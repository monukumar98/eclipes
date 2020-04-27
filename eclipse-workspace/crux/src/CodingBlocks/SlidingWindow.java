package CodingBlocks;

import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class SlidingWindow {

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
			// System.out.println();

		}
	}

	private static void windowProblem(int[] arr, int k) {
		// TODO Auto-generated method stub
		LinkedList<Integer> q = new LinkedList<>();
		int i = 0;
		for (; i < k; i++) {
			while (!q.isEmpty() && arr[i] >= arr[q.getLast()]) {
				q.removeLast();
			}
			q.add(i);
		}
		for (; i < arr.length; i++) // Sliding window technique
		{

			if (!q.isEmpty()) {
				System.out.print(arr[q.peek()]+" ");
			}

			while (!q.isEmpty() && q.getFirst() <= i - k)
				q.removeFirst(); // Removing the front if it is no more in the range.

			while (!q.isEmpty() && arr[i] >= arr[q.getLast()])
				q.removeLast(); // Pop all the smaller numbers from back.

			q.add(i); // Push the current number index
		}
		if (!q.isEmpty()) {
			System.out.println(arr[q.peek()]);

		}

	}

}
