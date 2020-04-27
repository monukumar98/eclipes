package CodingBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeVisit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while (t-- > 0) {
			//int a = sc.nextInt();
			int b = sc.nextInt();
		//	System.out.println(SOE(a, 1_000_000_00));
			System.out.println(Deepak_prime(b,1_0000_0000));
	//	}
	}

	public static int SOE(int a, int b) {

		boolean[] primes = new boolean[(b + 1)];

		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int table = 2; table * table <= b; table++) {

			if (primes[table] == false) {
				continue;
			}

			for (int multiplier = 2; table * multiplier <= b; multiplier++) {
				primes[table * multiplier] = false;
			}

		}
		int ans = 0;
		for (int i = a; i < primes.length; i++) {
			if (primes[i]) {
				ans++;
			}
		}
		return ans;

	}
	public static int Deepak_prime(int a,int b) {
		boolean[] primes = new boolean[(b + 1)];

		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int table = 2; table * table <= b; table++) {

			if (primes[table] == false) {
				continue;
			}

			for (int multiplier = 2; table * multiplier <= b; multiplier++) {
				primes[table * multiplier] = false;
			}

		}
		int j=0;
		int ans[] = new int [5000000+5];
		for(int i=0; i<primes.length && j<ans.length; i++) {
			if(primes[i]) {
				ans[j]=i;
				j++;
			}
		}
		
		return ans[a-1];
	}

}
