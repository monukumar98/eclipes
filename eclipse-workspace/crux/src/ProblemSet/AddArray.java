package ProblemSet;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ar1 = new int[n];
		for (int i = 0; i < n; i++) {
			ar1[i] = s.nextInt();
		}
		int m = s.nextInt();
		int[] ar2 = new int[m];
		for (int i = 0; i < m; i++) {
			ar2[i] = s.nextInt();
		}
//        int[] ar1= {1,0,2,9};
//        int[] ar2= {3,4,5,6,7};
		addArray(ar1, ar2);
	}

	public static void addArray(int[] ar1, int[] ar2) {
		int max = Math.max(ar1.length, ar2.length) + 1;
		int m;
		int maxi = max;
		int[] add = new int[max];
		// ArrayList<Integer> list new ArrayList<>();
		for (int i = ar2.length - 1; i >= 0; i--) {
			add[max - 1] += ar2[i];
			max--;
		}
		for (int i = ar1.length - 1; i >= 0; i--) {

			int s = 0;
			s = add[maxi - 1] + ar1[i];
			if (s >= 10) {
				s = s - 10;
				add[maxi - 1] = s;
				add[maxi - 2] += 1;
				maxi--;
			} else {
				add[maxi - 1] += ar1[i];
				maxi--;
			}
		}
		// System.out.println(Arrays.toString(add));
		if (add[0] != 0)
			m = 0;
		else
			m = 1;
		while (m < add.length) {
			System.out.print(add[m] + ", ");
			m++;
		}
		System.out.println("END");
	}
}