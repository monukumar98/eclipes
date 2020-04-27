package ProblemSet;
import java.util.*;
public class ultraMath {
    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			String s = Integer.toString(n);
			StringBuilder  ans = new StringBuilder();
			int l = s.length();
			int i=0;
			while(i<l){
				int rem = n%10;
				int rem1=m%10;
				int t1 = rem^rem1;
				ans = ans.append(t1);
				n/=10;
				m/=10;
				i++;
			}
			System.out.println(ans.reverse());
		}
    }
}