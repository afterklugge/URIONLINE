
package String;

import java.util.*;

public class DancingSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		char[] getWords = words.toCharArray();
		int x = 0;
		for (int i = 0; i < getWords.length; i++) {
			if (getWords[i] >= 'A' && getWords[i] <= 'Z') {
				x++;
				if (x % 2 == 0) {
					getWords[i] += 32;
				}
			}
			if (getWords[i] >= 'a' && getWords[i] <= 'z') {
				x++;
				if (x % 2 != 0) {
					getWords[i] -= 32;
				}
			}
		}
		String finalResult = String.valueOf(getWords);
		System.out.println(finalResult);
	}

}