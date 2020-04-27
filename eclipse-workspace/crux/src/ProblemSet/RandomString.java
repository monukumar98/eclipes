package ProblemSet;
//Java program generate a random AlphaNumeric String 

//using CharSet method 

import java.util.*;
import java.nio.charset.*;

public class RandomString {

	public static void getAlphaNumericString(int n) {

		// length is bounded by 256 Character
		byte[] array = new byte[256];
		new Random().nextBytes(array);

		String randomString = new String(array, Charset.forName("UTF-8"));

		for (int i = 0; i < 10; i++) {
			StringBuffer r = new StringBuffer();
			for (int k = 0; k < randomString.length(); k++) {

				char ch = randomString.charAt(k);

				if (ch >= 'a' && ch <= 'z') {

					r.append(ch);
					n--;
				}
			}

			// return the resultant string
			System.out.print(r.toString() +" ");
		}
	}

	public static void main(String[] args) {
		// size of random alphanumeric string
		int n = 26;

		// Get and display the alphanumeric string
		getAlphaNumericString(n);
	}
}
