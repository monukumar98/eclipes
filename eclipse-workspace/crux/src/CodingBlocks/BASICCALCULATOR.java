package CodingBlocks;

import java.util.*;

public class BASICCALCULATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			String ch = sc.next();
			int res;
			switch (ch) {
			case "+": {
				int no1 = sc.nextInt();
				int no2 = sc.nextInt();
				res = no1 + no2;
				System.out.println(res);
				break;

			}
			case "-": {
				int no1 = sc.nextInt();
				int no2 = sc.nextInt();
				res = no1 - no2;
				System.out.println(res);
				break;

			}
			case "*": {
				int no1 = sc.nextInt();
				int no2 = sc.nextInt();
				res = no1 * no2;
				System.out.println(res);
				break;

			}
			case "/": {
				int no1 = sc.nextInt();
				int no2 = sc.nextInt();
				res = no1 / no2;
				System.out.println(res);
				break;

			}
			case "%": {
				int no1 = sc.nextInt();
				int no2 = sc.nextInt();
				res = no1 % no2;
				System.out.println(res);
				break;

			}
			case "X":
				System.exit(0);
				break;
			case "x":
				System.exit(0);
			default:
				System.out.println("Invalid operation. Try again.");
				break;
			}
		}
	}
}