import java.util.Scanner;

public class URI1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x, y, odd = 0;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();

			if (x > y) {
				for (int j = y + 1; j < x; j++) {
					if (j % 2 == 1 || j % 2 == -1) {
						odd += j;
					}
				}
			}
			else if(x < y) {
				for (int k = x + 1; k < y; k++) {
					if (k % 2 == 1 || k % 2 == -1) {
						odd += k;
					}
				}
			}
			else {
				odd = 0;
			}
			System.out.println(odd);
			odd = 0;
		}
	}
}
