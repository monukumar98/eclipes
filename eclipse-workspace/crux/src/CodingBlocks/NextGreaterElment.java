package CodingBlocks;

import java.util.*;
import java.util.Stack;

public class NextGreaterElment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Stack<Integer> stack = new Stack<Integer>();
			nextGreaterElement(arr, stack);

			test--;
		}
	}

	public static void nextGreaterElement(int[] arr, Stack<Integer> stack) {
		int ans[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
				ans[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "," + ans[i]);
		}

	}

}
