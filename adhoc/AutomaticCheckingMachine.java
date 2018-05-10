package adhoc;

import java.util.*;

public class AutomaticCheckingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = false;

		while (sc.hasNextInt()) {
			int[] plug = new int[5];
			int[] outlet = new int[5];

			for (int i = 0; i < 5; i++) {
				int x = sc.nextInt();
				plug[i] = x;
			}
			for (int i = 0; i < 5; i++) {
				int y = sc.nextInt();
				outlet[i] = y;
			}
			for (int i = 0; i < plug.length; i++) {
				for (int j = 0; j < outlet.length; j++) {
					if ((plug[i] == 1 && outlet[j] == 0) || (plug[i] == 0 && outlet[j] == 1)) {
						check = true;
					} else {
						check = false;
						break;
					}
				}
			}
			if (check == true) {
				System.out.println("Y");
			} else if (check == false) {
				System.out.println("N");

			}
		}
	}
}
