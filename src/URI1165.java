import java.util.Scanner;

public class URI1165 {

	public static void main(String[] args) {
		int x, n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			boolean isPrime = true;
			for (int j = 2; j < x; j++) {
				if (x % j == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				System.out.println(x + " eh primo");
			} else {
				System.out.println(x + " nao eh primo");
			}
		}
	}
}