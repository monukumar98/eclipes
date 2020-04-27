package CodingBlocks;

import java.util.*;
import java.util.Stack;

public class StackSpam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int ans[] = stackspam(arr);
		for (int val : ans) {
			System.out.print(val + " ");
		}
		System.out.println("END");
	}

	public static int[] stackspam(int arr[]) {
		Stack<Integer> stack = new Stack();
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
				stack.pop();

			}
			if (stack.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - stack.peek();
			}
			stack.push(i);
		}

		return ans;
	}

}
