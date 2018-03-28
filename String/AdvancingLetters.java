package String;

import java.util.*;

public class AdvancingLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < N; i++) {
			String A = sc.next();
			String B = sc.next();
			int counter = 0;

			if (A.length() == B.length()) {
				if (A.equals(B)) {
					System.out.println("0");
					continue;
				}
				char[] a = A.toCharArray();
				char[] b = B.toCharArray();

				for (int k = 0; k < a.length; k++) {
					if ((int) a[k] > (int) b[k])
						counter += 26 - ((int) a[k] - (int) b[k]);
					else if ((int) a[k] < (int) b[k])
						counter += ((int) b[k] - (int) a[k]);
					else
						counter += 0;
				}
				
				System.out.println(counter);
			}
		}
	}
}
