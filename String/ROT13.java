package String;
// Third condition of task doesn't work!
import java.util.*;

public class ROT13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();
		char[] getLetters = text.toCharArray();

		for (int j = 0; j < getLetters.length; j++) {
			if (Character.isLetter(getLetters[j])) {
				if (getLetters[j] - 13 < 'A' || getLetters[j] - 13 < 'a') {
					getLetters[j] = (char) ((int) (26 - 13) + getLetters[j]); // 'C' 5steps: 26 - 13 + 'C'(67)
				} else {
					getLetters[j] = (char) ((int) (getLetters[j] - 13));
				}
			}
		}
		String finalResult = String.valueOf(getLetters);
		System.out.println(finalResult);
	}
}
