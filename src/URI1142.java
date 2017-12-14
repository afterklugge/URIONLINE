import java.util.Scanner;

public class URI1142 {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= (4*n - 1); i += 4) {
			for (int j = i; j <= i + 2; j++) {
				System.out.print(j + " ");
			}
			System.out.print("PUM\n");
		}
	}
}
