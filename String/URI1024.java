package String;

import java.util.*;

public class URI1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// пробелы читает
		int x = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < x; i++) {
			String N = sc.nextLine();
			char[] getArray = N.toCharArray(); // must have!!!
			char[] reverse = new char[getArray.length];
			for (int j = 0; j < getArray.length; j++) {
				if (Character.isLetter(getArray[j])) { // if value is character
					getArray[j] = (char) ((int) (getArray[j] + 3));
				}
			}
			int z = 0;
			for (int y = getArray.length - 1; y >= 0; y--) {
				reverse[z] = getArray[y];
				z++;
			}
			for (int j = reverse.length / 2; j < reverse.length; j++) {
				reverse[j] = (char) ((int) (reverse[j] - 1));
			}

			String finalResult = String.valueOf(reverse);
			System.out.println(finalResult);
		}

	}

}