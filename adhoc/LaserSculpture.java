package adhoc;

import java.util.Scanner;

public class LaserSculpture {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int a = scan.nextInt();
			int c = scan.nextInt();
			scan.nextLine();
			if (a == 0 && c == 0)
				break;
			int count = 0;
			int prev = a;
			for (int i = 0; i < c; i++) {
				int step = scan.nextInt();
				if (a - step > a - prev)
					count += prev - step;
				prev = step;
			}
			System.out.println(count);
		}
	}
}