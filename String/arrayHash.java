package String;
// Ответ неправильный выходит
import java.util.*;

public class arrayHash {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int N = Integer.parseInt(input);
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();

			for (int j = 0; j < n; j++) {
				String text = sc.next();
				char[] getArray = text.toCharArray();

				for (int k = 0; k < getArray.length; k++) {
					int alpPos = (int) getArray[k] - 65;
					sum += alpPos + k + j;
				}
			}
			System.out.println(sum);
		}
	}

}
