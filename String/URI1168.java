package String;

import java.util.*;

public class URI1168 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int ledsNeeded = 0;
			String x = sc.next();
			char[] digits = x.toCharArray();
			for (int j = 0; j < digits.length; j++) {
				ledsNeeded += numberOfLeds(digits[j]);
			}

			System.out.println(ledsNeeded + " leds");
		}

	}

	public static int numberOfLeds(char digit) {

		int res = 0;

		switch (digit) {
		case '1':
			res = 2;
			break;
		case '2':
		case '3':
		case '5':
			res = 5;
			break;
		case '4':
			res = 4;
			break;
		case '6':
		case '9':
		case '0':
			res = 6;
			break;
		case '7':
			res = 3;
			break;
		case '8':
			res = 7;
			break;
		}

		return res;
	}
}
