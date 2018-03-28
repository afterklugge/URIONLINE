package String;

import java.util.*;

public class Aliteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String text = sc.nextLine().toLowerCase();
			System.out.println(alliteration(text));
		}
	}
	public static int alliteration(String text) {
		int allit = 0;
		boolean sameLetter = true;
		
		String words[] = text.split(" ");
		char currentLetter = words[0].charAt(0); // Берем первую букву слова
		
		for (int i = 1; i < words.length; i++) {
			if(words[i].charAt(0) == currentLetter && sameLetter) {
				allit++;
				sameLetter = false;
			}
			else if(words[i].charAt(0) != currentLetter) {
				sameLetter = true;
				currentLetter = words[i].charAt(0);
			}
		}
		return allit;
	}
}
