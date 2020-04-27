package CodingBlocks;

import java.util.Scanner;

public class RemoveX {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuilder bldr = new StringBuilder(str);
		StringBuilder res = removeX(bldr, 0);
		System.out.println(res);
	}

	public static StringBuilder removeX(StringBuilder bldr, int index) {
		if (index == bldr.length()) {

			return bldr;
		}
		if (bldr.charAt(index) == 'x') {
			bldr.deleteCharAt(index);
			bldr.append('x');
			return removeX(bldr, index + 1);
		} else
			return removeX(bldr, index + 1);
	}
}