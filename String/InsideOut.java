package String;

import java.util.*;

public class InsideOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());		
		for (int i = 0; i < x; i++) {
			String text = sc.nextLine();
			char[] getLetter = text.toCharArray();
			char[] reverse = new char[getLetter.length];
			int z = 0;
			int y;
			for (y = getLetter.length / 2 - 1; y >= 0; y--) {
				reverse[z] = getLetter[y];
				++z;
			}
			for (y = getLetter.length - 1; y >= getLetter.length / 2; y--) {
				reverse[z] = getLetter[y];
				++z;
			}

			String finalResult = String.valueOf(reverse);
			System.out.println(finalResult);
		}
	}
}