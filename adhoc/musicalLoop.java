package adhoc;

import java.util.Scanner;

public class musicalLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			if (x == 0) {
				break;
			}
			sc.nextLine();
			if (x == 2) {
				sc.nextLine();
				System.out.println("2");
			} else {
				int[] magnitude = new int[x + 2];
				int peaks = 0;
				for (int j = 1; j <= x; j++) {
					magnitude[j] = sc.nextInt();
				}
				magnitude[0] = magnitude[x];
				magnitude[x + 1] = magnitude[1];
				for (int i = 1; i <= x; i++) {
					if (magnitude[i - 1] < magnitude[i] && magnitude[i] > magnitude[i + 1]
							|| magnitude[i - 1] > magnitude[i] && magnitude[i] < magnitude[i + 1]) {
						peaks++;
					}

				}
				System.out.println(peaks);

			}
		}
	}
}