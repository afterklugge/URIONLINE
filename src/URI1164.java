import java.util.Scanner;

public class URI1164 {

	public static void main(String[] args) {
		int x = 0, n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int sum = 0;
			x = sc.nextInt();
			////////////////////////
			for (int j = 1; j < x; j++) {
				if ((x % j) == 0) {
					sum += j;
				}
			}
			if (sum == x) {
				System.out.println(x + " eh perfeito");
			} else {
				System.out.println(x + " nao eh perfeito");
			}
		}

	}

}
