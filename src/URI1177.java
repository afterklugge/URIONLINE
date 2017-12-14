import java.util.Scanner;

public class URI1177 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;

		x = sc.nextInt();

		for (y = 0, z = 0; y < 1000; y++) {
			System.out.printf("N[%d] = %d\n", y, z);
			z++;
			if (z == x) {
				z = 0;
			}
		}

	}

}