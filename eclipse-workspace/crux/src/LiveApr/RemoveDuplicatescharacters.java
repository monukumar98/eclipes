package LiveApr;

import java.util.Scanner;

public class RemoveDuplicatescharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(printanswer(str.substring(1), str.substring(0, 1)));

	}

	public static String printanswer(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			
			return ans;
		}
		
		if(ans.charAt(ans.length()-1)==str.charAt(0)) {
		return 	printanswer(str.substring(1), ans);
		}
		else {
			return printanswer(str.substring(1), ans+str.charAt(0));
		}
		
		
		
		
		
	}

}
