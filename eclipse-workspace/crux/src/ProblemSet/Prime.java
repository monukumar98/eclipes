package ProblemSet;

import java.util.*;

public class Prime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int i = 2;
		while (i <= N) {
			boolean bool = false;
			int j = 2;
			while (j < i) {
				if (i % j == 0) {
					bool = true;
					break;
				}
				j++;
			}
			if (bool == false) {
				System.out.println(i);
			}
			i++;
		}
	}
}