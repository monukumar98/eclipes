package LiveApr;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 1;
		if (str.length() == 1) {
			System.out.println(str + 1);
			return ;
		}
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				System.out.print(str.charAt(i));
				System.out.print(count);
				count = 1;
			}

		}
		if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)) {
			System.out.print(str.charAt(str.length() - 1));
			System.out.print(count);
		} else {
			System.out.print(str.charAt(str.length() - 1));
			System.out.print(1);
		}

	}

}
