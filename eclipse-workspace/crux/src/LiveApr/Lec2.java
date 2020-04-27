package LiveApr;

import java.util.Scanner;

public class Lec2
{
	public static void main(String[] args) {
	    int n;
	    Scanner sc =  new Scanner(System.in);
	    n = sc.nextInt();
	    int x = n;
	    int s = 1;
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=x;j++)
	        {
	            if(j<s)
	            System.out.print("  ");
	            else
	            System.out.print("* ");
	        }
	        System.out.println();
	        x++;
	        s+=2;
	    }
	}
}