import java.util.Locale;
import java.util.Scanner;

public class URI1116 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = (a / b);
			if (b == 0) {
				System.out.printf("divisao impossivel\n");
			} else {
				System.out.printf("%.1f\n", c);
			}
		}
	}
}
