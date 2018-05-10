package adhoc;

import java.util.*;

public class sumOfTwoSquares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, i, j, s;
		boolean b;
		while (scan.hasNextInt()) {
			n = scan.nextInt();
			i = 0;
			b = false;
			j = (int) Math.sqrt(n);

			while (j >= i) {
				s = (int) (i * i + j * j);
				if (s == n) {
					b = true;
					break;
				} else if (s < n) {
					i++;
				} else {
					j--;
				}
			}

			if (b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}
