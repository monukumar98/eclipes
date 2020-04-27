package LiveApr;

import java.util.ArrayList;
import java.util.Scanner;

public class KayPaid {
	static String arr[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// printanswer(str, "");
		// System.out.println();
		// System.out.println(printanswer1(str));
		ArrayList<String> ans = printanswer1(str);
		for (String val : ans) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println(ans.size());

	}

	public static void printanswer(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = str.charAt(0);
		String getstring = arr[ch - 48 - 1];
		for (int i = 0; i < getstring.length(); i++) {
			printanswer(str.substring(1), ans + getstring.charAt(i));

		}
	}

	public static ArrayList<String> printanswer1(String str) {
		if (str.length() == 0) {
			ArrayList<String> bsa = new ArrayList<>();
			bsa.add("");
			return bsa;

		}
		char ch = str.charAt(0);
		String getstring = arr[ch - 48 - 1];

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> roq = printanswer1(str.substring(1));
		for (int i = 0; i < getstring.length(); i++) {
			for (String val : roq) {
				mr.add(getstring.charAt(i) + val);
			}

		}
		return mr;
	}

}
