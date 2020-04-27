package CodingBlocks;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class runningmedian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		printMedian(arr);
	}

	public static void printMedian(int[] a) {

		int med = a[0];

		PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());

		PriorityQueue<Integer> greater = new PriorityQueue<>();

		smaller.add(a[0]);
		System.out.println(med);

		for (int i = 1; i < a.length; i++) {

			int x = a[i];

			if (smaller.size() > greater.size()) {
				if (x < med) {
					greater.add(smaller.remove());
					smaller.add(x);
				} else
					greater.add(x);
				//System.out.println(smaller.peek()+" peek");
				med = (smaller.peek() + greater.peek()) / 2;
			}

			else if (smaller.size() == greater.size()) {
				if (x < med) {
					smaller.add(x);
					med = smaller.peek();
				} else {
					greater.add(x);
					med = greater.peek();
				}
			}

			else {
				if (x > med) {
					smaller.add(greater.remove());
					greater.add(x);
				} else
					smaller.add(x);
				med = (smaller.peek() + greater.peek()) / 2;

			}
			System.out.println(med);
		}
	}
}
