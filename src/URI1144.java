import java.util.Scanner;

public class URI1144 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		if (x > 1 && x < 1000) {
			for (int i = 1; i <= x; i++) {
				System.out.printf("%d %d %d%n", i, i * i, i * i * i);
				System.out.printf("%d %d %d%n", i, i * i + 1, i * i * i + 1);
			}
		}
	}
}
