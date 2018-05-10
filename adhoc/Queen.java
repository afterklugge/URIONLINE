package adhoc;

import java.util.*;

public class Queen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
				break;
			}

			if (x1 == x2 && y1 == y2) {
				System.out.println("0");
			} else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
				System.out.println("1");
			} else {
				System.out.println("2");
			}
		}
	}

}
