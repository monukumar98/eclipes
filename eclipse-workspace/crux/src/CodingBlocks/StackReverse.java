package CodingBlocks;

import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		System.out.println(stack);
		Stack<Integer> Help = new Stack<>();
		reverse(stack, Help, 0);

		System.out.println(stack);
		reversewithoutusingExtraSpce(stack);
		System.out.println(stack);

	}

	public static void reverse(Stack<Integer> s, Stack<Integer> Help, int i) {
		if (s.isEmpty()) {
			return;
		}
		int item = s.pop();
		reverse(s, Help, i + 1);
		Help.push(item);
		if (i == 0) {

			while (!Help.isEmpty()) {

				s.push(Help.pop());
			}
		}

	}

	public static void reversewithoutusingExtraSpce(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int x = s.pop();
		reversewithoutusingExtraSpce(s);
		Insert_at_bottom(s, x);

	}

	public static void Insert_at_bottom(Stack<Integer> s, int x) {
		if (s.isEmpty()) {
			s.push(x);
			return;
		}
		int v = s.pop();
		Insert_at_bottom(s, x);
		s.push(v);

	}

}
