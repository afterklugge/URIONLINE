package adhoc;

import java.util.*;

public class DetectiveWatson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] suspect = new int[n];
			int[] index = new int[n];

			for (int j = 0; j < n; j++) {
				int foo = sc.nextInt();
				suspect[j] = foo;
				index[j] = foo;
			}
			Arrays.sort(suspect);
			for (int j = 0; j < index.length; j++) {
				if (suspect[n - 2] == index[j]) {
					System.out.println(j + 1);
				}
			}
		}
	}
}
