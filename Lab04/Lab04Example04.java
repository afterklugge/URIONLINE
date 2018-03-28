package Lab04;

import java.util.*;

public class Lab04Example04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayListInt list = new ArrayListInt();

		while (sc.hasNextInt()) {
			int N = sc.nextInt();
			list.add(N);
		}
		System.out.println("After insertions: ");
		for (int i = 0; i < list.size();) {
			if (list.get(i) % 2 == 0) {
				list.add(i, 0);
				i++;
			}
			i++;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("After deletions: ");
		for (int i = 0; i < list.size();) {
			if (list.get(i) % 2 != 0) {
				list.remove(i);
			}
			i++;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
