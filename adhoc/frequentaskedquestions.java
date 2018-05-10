package adhoc;

import java.util.*;

public class frequentaskedquestions {

	// FREQUENTLY ASKED QUESTIONS

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int totalq = sc.nextInt();
			int frequency = sc.nextInt();
			int[] a = new int[100];
			boolean[] isRepeat = new boolean[100];
			int count = 0;
			if (totalq == 0 && frequency == 0) {
				break;
			} else {
				for (int i = 0; i < totalq; i++) {
					int q = sc.nextInt();
					a[q - 1]++;

					if (a[q - 1] >= frequency && !isRepeat[q - 1]) {
						count++;
						isRepeat[q - 1] = true;

					}
				}
				System.out.println(count);
			}
		}
	}
}