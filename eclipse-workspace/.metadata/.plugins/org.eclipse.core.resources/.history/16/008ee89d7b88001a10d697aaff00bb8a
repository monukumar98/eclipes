package LiveApr;

import java.util.Scanner;

public class RecursionDuplicatecharacterformatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(printanswer(str));

	}

	public static String printanswer(String str) {
		if (str.length() == 1) {
			return str.substring(0);
		}
		if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + printanswer(str.substring(1));

		} else {
			return str.charAt(0) + printanswer(str.substring(1));
		}
	}

}
