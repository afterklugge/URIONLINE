package String;

import java.util.*;

public class Huaauhahhuahau {

	private static String VOWELS = "aeiou";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		char[] getText = text.toCharArray();
		boolean isFunny = true;
		
		ArrayList<Character> onlyVowels = new ArrayList<Character>();
		for (int i = 0; i < getText.length; i++) {
			if (isVowel(getText[i])) {
				onlyVowels.add(getText[i]);
			}
		}
		
		int z = onlyVowels.size()-1;
		for (int i = 0; i < onlyVowels.size(); ++i) {
			if(onlyVowels.get(z) != onlyVowels.get(i)) {
				isFunny = false;
				break;
			}
			--z;
		}
		
		if (isFunny)
			System.out.println("S");
		else 
			System.out.println("N");
	
	}

	private static boolean isVowel(char c) {
		return VOWELS.indexOf(Character.toLowerCase(c)) >= 0;
	}
}
