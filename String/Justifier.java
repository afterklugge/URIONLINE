package String;

import java.util.*;
// Третье условие не работает
public class Justifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while (n != 0) {
			String[] word = new String[n];
			int longest = 0;

			for (int i = 0; i < n; i++) { //
				word[i] = sc.nextLine();
				if (word[i].length() > longest) { // determine which word is the longest
					longest = word[i].length();
				}
			}

			for (int i = 0; i < n; i++) {
				String space = "";

				if (word[i].length() < longest) { // determine which word is not longest
					for (int j = 0; j < longest - word[i].length(); j++) {
						space += " ";
					}
				}
				space += word[i];
				System.out.println(space);
			}

			n = Integer.parseInt(sc.nextLine());
			if (n != 0) {
				System.out.println();
			}
		}
	}
}