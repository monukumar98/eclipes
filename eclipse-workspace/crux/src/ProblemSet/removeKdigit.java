package ProblemSet;

import java.util.*;
import java.lang.*;
import java.io.*;

public class removeKdigit {

	public static String removeKdigits(String n, int k) {
		StringBuilder sb = new StringBuilder();

		Stack<Character> s = new Stack<>();

		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);

			while (k > 0 && !s.isEmpty() && s.peek() > n.charAt(i)) {
				s.pop();
				k--;
			}
			s.push(ch);
		}

		while (!s.isEmpty())
			sb.insert(0, s.pop());
		int i;

		System.out.println(sb);
		String ans = sb.substring(0, sb.length() - k);
		System.out.println(ans);

		for (i = 0; i < ans.length() && ans.charAt(i) == '0'; i++)

			ans = ans.substring(i);

		return ans.equals("") ? "0" : ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(removeKdigits(scn.next(), scn.nextInt()));
	}
}