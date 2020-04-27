package LiveApr;

import java.util.Scanner;

public class lec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Gcd(a, b);

	}

	public static void fibbo(int n) {
		int a = 0;
		int b = 1;
		if (n == 0 || n == 1) {
			System.out.println(n);
		}
		for (int i = 2; i <= n; i++) {
			int sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}

	}

	public static void Gcd(int a, int b) {
		while (b % a != 0) {
			int rem = b % a;
			b = a;
			a = rem;
		}
		System.out.println(a);
	}

	public static void reveseNumber(int n) {
		int sum=0;
		for(int i=2; i<n;) {
			if(n%i==0) {
				sum+=i;
			}
			else {
				i++;
			}
			
		}

	}

}
