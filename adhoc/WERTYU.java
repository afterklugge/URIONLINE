package adhoc;

import java.util.*;

public class WERTYU {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] letters = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./".toCharArray();
		for (int i = 1; i < letters.length; i++) {
			text = text.replace(letters[i], letters[i - 1]);
		}
		System.out.println(text);
	}

}
