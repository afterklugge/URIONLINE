package adhoc;

import java.util.*;

public class HoursAndMinutes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			
			if (n % 6 == 0) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}

	}
}
