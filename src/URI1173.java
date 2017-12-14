import java.util.Scanner;

public class URI1173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] anArray = new int[10];
		anArray[0] = sc.nextInt();

		System.out.println("N[0] = " + anArray[0]);

		for (int i = 1; i < 10; i++) {
			anArray[i] = anArray[i - 1] * 2;
			System.out.printf("N[%d] = %d\n", i, anArray[i]);
		}
	}
}
