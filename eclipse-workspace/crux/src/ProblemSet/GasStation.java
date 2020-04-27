package ProblemSet;

import java.util.*;
import java.lang.*;
import java.io.*;

public class GasStation {

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int total = 0;
		int cur = 0;
		int s = 0;
		for (int i = 0; i < gas.length; i++) {
			total = total + gas[i] - cost[i];
			cur += gas[i] - cost[i];
			if (cur < 0) {
				cur = 0;
				s = i + 1;
			}
		}
		if (total >= 0)
			return s;
		else
			return -1;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scn.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = scn.nextInt();
		System.out.println(canCompleteCircuit(a, b));
	}
}