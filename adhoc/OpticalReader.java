package adhoc;

import java.util.*;

public class OpticalReader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();

			if (x == 0) {
				break;
			}
			int A, B, C, D, E;
			for (int i = 0; i < x; i++) {
				A = sc.nextInt();
				B = sc.nextInt();
				C = sc.nextInt();
				D = sc.nextInt();
				E = sc.nextInt();

				if (A > 127 && B > 127 && C > 127 && D > 127 && E > 127)
					System.out.println("*");
				else if ((A <= 127 && B <= 127 || A <= 127 && C <= 127 || A <= 127 && D <= 127 || A <= 127 && E <= 127)
						|| (B <= 127 && C <= 127 || B <= 127 && D <= 127 || B <= 127 && E <= 127) || // SIMPLIFY!!
						(C <= 127 && D <= 127 || C <= 127 && E <= 127) || D <= 127 && E <= 127) {
					System.out.println("*");
				}

				else if (A < B && A < C && A < D && A < E)
					System.out.println("A");
				else if (B < A && B < C && B < D && B < E)
					System.out.println("B");
				else if (C < A && C < B && C < D && C < E)
					System.out.println("C");
				else if (D < A && D < B && D < C && D < E)
					System.out.println("D");
				else if (E < A && E < B && E < C && E < D)
					System.out.println("E");
			}
		}
	}
}