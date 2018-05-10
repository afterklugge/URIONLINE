package adhoc;

import java.util.*;

public class FakeTickets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int people = sc.nextInt();

			int tickets = sc.nextInt();

			int count = 0;
			if (tickets == 0 && people == 0) {
				break;
			}

			int[] numOfTicketsArr = new int[20000];
			for (int i = 0; i < people; i++) {
				int numOfTick = sc.nextInt();
				numOfTicketsArr[numOfTick - 1]++;
			}
			for (int i = 0; i < numOfTicketsArr.length; i++) {
				if (numOfTicketsArr[i] > 1) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}