package LiveApr;

import java.util.*;

public class Replaceallpi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			System.out.println(printanser(str));
		}

	}

	public static String printanser(String str) {
		if (str.length() == 0) {
			return "";
		}
		String cc = str.substring(0, 1);
		if (cc.equals("p")) {
			if (str.length() >= 2) {
				String cc1 = str.substring(0, 2);
				if (cc1.equals("pi")) {
					return "3.14" + printanser(str.substring(2));
				}
				else {
					return	cc+ printanser(str.substring(1));
					}

			} else {

				return cc + printanser(str.substring(1));

			}

		} else {
			return cc + printanser(str.substring(1));
		}
	}

}
