package adhoc;

import java.util.*;

public class HeadTail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			int mary = 0;
			int john = 0;
			for (int i = 0; i < n; i++) {
				int numbers = sc.nextInt();
				if (numbers == 0) {
					mary += 1;
				} else {
					john += 1;
				}
			}
			System.out.println("Mary won " + mary + " times and John won" + john + " times");
		}

	}

}
