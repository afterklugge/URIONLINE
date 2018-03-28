package String;

// Не до конца решена задача!
import java.util.*;

public class FirOrDontFit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String number1 = sc.next();
			String number2 = sc.next();

			if (number1.length() < number2.length()) {
				System.out.println("nao encaixa");
				continue;
			}

			int diff = number1.length() - number2.length();
			String substring = number1.substring(diff, number1.length());
			
			if (substring.equals(number2)) {
				System.out.println("encaixa");
			} else	{
				System.out.println("nao encaixa");
			}
			
		}

	}

}
