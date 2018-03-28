package String;
// Второе условие не работает почему-то...
import java.util.*;

public class InternationalChat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		boolean language = true;
		for (int i = 0; i < N; i++) {
			int count = sc.nextInt();
			sc.nextLine(); // Вот эта штука нужна, потому что без нее не работает.
			String[] word = new String[count];
			
			for (int j = 0; j < count; j++) { // Запихиваем все языки в массив, чтобы он отображался ровно столько раз сколько хотим.
				word[j] = sc.nextLine();

				if (j != 0 && !word[j - 1].equals(word[j])) { // Не проверяет первое слово, если индекс не совпадает с предыдущим, то фолс.
					language = false;
				} else {
					language = true;
				}
			}
			if (language == true)
				System.out.println(word[0]); // Если тру, то просто вытаскиваем первое слово
			if (language == false)
				System.out.println("ingles");

		}
	}
}
