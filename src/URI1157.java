import java.util.Scanner;

public class URI1157 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			int y = x;
			y = y % i;
			if (y == 0) {
				System.out.println(i);
			}
		}
	}

}
