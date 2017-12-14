import java.util.*;

public class URI1172 {

	public static void main(String[] args) {
		int[] anArray = new int[10];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			anArray[i] = sc.nextInt();
			if (anArray[i] == 0 || anArray[i] < 0) {
				anArray[i] = 1;
			}
			System.out.printf("X[%d] = %d\n", i, anArray[i]);
		}
	}
}
