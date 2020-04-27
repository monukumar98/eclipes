package Bitmasking;

import java.util.*;

public class MaxXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int lst = a ^ b;
		int msbpos = 0;
		while (lst > 0) {
			msbpos++;
			lst = lst >> 1;

		}
		System.out.println(msbpos);
		int ans = 0;
		int two = 1;
	//	System.out.println(msbpos);
		while (msbpos-- > 0) {
			ans += two;
			two <<= 1;

		}
		System.out.println(ans);

	}

}
