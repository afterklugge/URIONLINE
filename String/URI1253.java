package String;

import java.util.*;

public class URI1253 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();//
		for (int i = 0; i < n; i++) { // quantity

			String str = scan.nextLine().toUpperCase();

			char sym[] = str.toCharArray(); //
			int step = scan.nextInt();
			for (int j = 0; j < sym.length; j++) {

				if (sym[j] - step < 65) {
					sym[j] = (char) ((int) (26 - step) + sym[j]);
				} else {
					sym[j] = (char) ((int) sym[j] - step);

				}

			}
			String StringFinal = String.valueOf(sym);
			System.out.println(StringFinal);

		}
	}
}