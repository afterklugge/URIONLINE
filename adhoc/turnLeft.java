package adhoc;

import java.util.*;

public class turnLeft {
	static int direction = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

				String side = sc.next();
				for (int j = 0; j < side.length(); j++) {
					if (side.charAt(j) == 'D') {
						direction++;
						if (direction == 4) {
							direction = 0;
						}
					} else if (side.charAt(j) == 'E') {
						direction--;
						if (direction == -1) {
							direction = 3;
						}
					}
				}
			
			switch (direction) {
			case 0:
				System.out.println("N");
				direction = 0;
				break;

			case 1:
				System.out.println("L");
				direction = 0;

				break;
			case 2:
				System.out.println("S");
				direction = 0;

				break;
			case 3:
				System.out.println("O");
				direction = 0;

				break;
			}
		}
	}
}
