package String;

import java.util.*;

public class URI1332 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result =  0;
		for (int i = 0; i < n; i++) {
			String word = sc.next();
			if (word.length() > 3) {
				result = 3;
			} else if (word.charAt(0) == 'o' && word.charAt(2) == 'e' || word.charAt(1) == 'n' && word.charAt(2) == 'e'
					|| word.charAt(0) == 'o' && word.charAt(1) == 'n') {
				result = 1;
			} else {
				result = 2;
			}
			System.out.println(result);
		}

	}
}