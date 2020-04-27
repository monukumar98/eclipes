package Bitmasking;

import java.util.*;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// Lexicographical(0, n);
		permut("", "abc");
		validParenthesi(3, "", 0, 0);
		coinToss(3, "");
		System.out.println(".............");
		coinTossNoConsecutiveHead(3, "");
	}

	public static void Lexicographical(int curr, int end) {
		if (curr > end) {
			return;

		}
		int i = 0;
		System.out.print(curr + " ");
		if (curr == 0) {
			i = 1;
		}

		for (; i <= 9; i++) {
			Lexicographical(curr * 10 + i, end);
		}
	}

	public static void permut(String ans, String Ques) {
		if (Ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < Ques.length(); i++) {
			char ch = Ques.charAt(i);
			String roq = Ques.substring(0, i) + Ques.substring(i + 1);
			permut(ans + ch, roq);
		}
	}

	public static void validParenthesi(int n, String ans, int open, int close) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || close > n || close > open) {
			return;
		}
		// validParenthesi(n, ans + "(", open + 1, close);
		validParenthesi(n, ans + ")", open, close + 1);
		validParenthesi(n, ans + "(", open + 1, close);

	}

	public static void coinToss(int N, String ans) {
		if (N == 0) {
			System.out.println(ans);
			return;
		}
		coinToss(N - 1, ans + "T");
		coinToss(N - 1, ans + "H");
	}

	public static void coinTossNoConsecutiveHead(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
			coinTossNoConsecutiveHead(n-1, ans+"H");
		}
		coinTossNoConsecutiveHead(n-1, ans+"T");
	}
}
