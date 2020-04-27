package ProblemSet;
import java.util.*;

public class Maxproduct {

    public static int maxProduct(int[] a) {
        
        if(a.length == 1) return a[0];

		int pp = 1, np = 1, max = Integer.MIN_VALUE;
		boolean hasZero = false, hasPos = false;

		for(int i : a)
		{
			if(i > 0)
			{
				hasPos = true;
				pp *= i;
				if(np != 1) np *= i;
			}

			else if(i < 0)
			{
				int temp = pp;
				pp = Math.max(1, np*i);
				np = temp * i;
			}

			else // i == 0
			{
				np = pp = 1;
				hasZero = true;
			}

			if(max < pp) max = pp;
		}

		if(max == 1)
		{
			if(hasPos) return max;
			if(hasZero) return 0;
		}
		return max;
        
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i] = scn.nextInt();
        System.out.println(maxProduct(a));
    }
}