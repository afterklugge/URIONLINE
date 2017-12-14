import java.util.Scanner;

public class URI1132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, total = 0;

		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) {
			for (int i = y; i <= x; i++) {
				y = i;
				if (y % 13 != 0) {
					total += y;
				}
			}
		} else if (x < y) {
			for (int i = x; i <= y; i++) {
				x = i;
				if (x % 13 != 0) {
					total += x;
				}
			}
		}
		System.out.print(total);
	}

}
