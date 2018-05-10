package adhoc;

import java.util.*;

public class Contest {

	// CONTEST

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int lines = scan.nextInt();
			int problems = scan.nextInt();

			boolean first = false, second = false, third = false, fourth = false;

			if (lines == 0 && problems == 0)
				break;

			int[][] board = new int[lines][problems];

			for (int i = 0; i < lines; ++i) {
				int count = 0;

				for (int j = 0; j < problems; ++j) {

					board[i][j] = scan.nextInt();
					count += board[i][j];

				}
				if (count == problems)
					first = true;// false not violated, true pravilo narusheno

				if (count == 0)
					fourth = true;

			}

			for (int i = 0; i < problems; ++i) {
				int reversecount = 0;

				for (int j = 0; j < lines; ++j) {
					reversecount += board[j][i];

				}
				if (reversecount == lines)
					third = true;

				if (reversecount == 0)
					second = true;
			}
			int result = 4;
			if (first)// first == true
				result--;
			if (second)
				result--;
			if (third)
				result--;
			if (fourth)
				result--;

			System.out.println(result);
		}

	}

}
