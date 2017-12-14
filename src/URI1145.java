import java.util.Scanner;

public class URI1145 {

	public static void main(String[] args) {
		int x, y;

		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();

		if (x < y) {
			if ((x > 1 && x < 20) && (y > x && y < 100000)) {
				for (int j = 1; j <= y; j++) {
					int count =+ j;
					System.out.printf("%d ", j);
					if (count % x == 0) {
						System.out.print("\n");
					}
				}
			}
		}
	}
}
