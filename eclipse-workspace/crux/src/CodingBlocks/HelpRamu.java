package CodingBlocks;

import java.util.*;;

public class HelpRamu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SOE(5);
		int test = sc.nextInt();
		while (test > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int nor = sc.nextInt();
			int noc = sc.nextInt();
			int[] freqr = new int[nor];
			int[] freqc = new int[noc];
			for (int i = 0; i < nor; i++) {
				freqr[i] = sc.nextInt();
			}
			for (int i = 0; i < noc; i++) {
				freqc[i] = sc.nextInt();
			}

			System.out.println(minammount(c1, c2, c3, c4, freqr, freqc));
			test--;
		}
	}

	public static int minammount(int c1, int c2, int c3, int c4, int freqr[], int freqc[]) {
		int ans = 0, sum = 0;
		for (int i = 0; i < freqr.length; i++) {
			ans += Math.min(c1 * freqr[i], c2);

		}

		ans = Math.min(ans, c3);

		for (int i = 0; i < freqc.length; i++) {
			sum += Math.min(c1 * freqc[i], c2);
		}
		sum = Math.min(sum, c3);
		ans = ans + sum;
		ans = Math.min(ans, c4);
		return ans;


	}
	
	
	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}

		int sp = power(x, n / 2);
		if (n % 2 == 0) {
			return sp * sp;
		} else {
			return sp * sp * x;
		}

	}
	public static void SOE(int n) {

		boolean[] primes = new boolean[n + 1];

		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int table = 2; table * table <= n; table++) {

			if (primes[table] == false) {
				continue;
			}

			for (int multiplier = 2; table * multiplier <= n; multiplier++) {
				primes[table * multiplier] = false;
			}

		}

		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				System.out.println(i);
			}
		}

	}
}

