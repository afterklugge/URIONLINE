package adhoc;

import java.util.*;

public class Colision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int Ax = sc.nextInt();
			int Ay = sc.nextInt();
			int Bx = sc.nextInt();
			sc.nextInt(); // By == Ay
			sc.nextInt(); // Cx = Bx
			int Cy = sc.nextInt();
			sc.nextInt(); // Dx == Ax
			sc.nextInt(); // Dy = Cy
			int Rx = sc.nextInt();
			int Ry = sc.nextInt();

			if (Rx >= Ax && Rx <= Bx && Ry >= Ay && Ry <= Cy) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}

		}
	}

}
