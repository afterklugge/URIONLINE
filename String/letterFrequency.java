package String;
// Последний ответ не выходит
import java.util.*;


public class letterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int n = Integer.parseInt(N);
		for (int i = 0; i < n; ++i) {
			String input = sc.nextLine().toLowerCase();
			input = input.replaceAll("[^a-zA-Z]+", "");
			char[] getArray = input.toCharArray();
			int[] alphabet = new int[26];

			for (int j = 0; j < getArray.length; ++j) {
				alphabet[getArray[j] - 97] += 1; // Превращаем 'a' в 0, b = 1...
			}

			int maxNumber = 0;
			for (int j = 0; j < alphabet.length; j++) {
				if (alphabet[j] > maxNumber) { // Находим наиболее частое используемое слово
					maxNumber = alphabet[j];
				}
			}

			for (int j = 0; j < alphabet.length; j++) {
				if (alphabet[j] == maxNumber) { // Если они совпадают, то делаем принт
					System.out.print((char) (j + 97));
				}
			}
			System.out.println();
		}
	}
}