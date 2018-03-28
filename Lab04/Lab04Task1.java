package Lab04;

import java.util.*;

public class Lab04Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		while (sc.hasNextInt()) {
			int x = sc.nextInt();
			list.add(x);
		}

		for (int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j) + " ");
		}
		System.out.println();
		// System.out.println(list);
		// Collections.reverse(list);
		// System.out.println(list);

		for (int p = 0, q = list.size() - 1; p < q; p++, q--) {
			int t = list.get(p);
			list.set(p, list.get(q));
			list.set(q, t);
		}
		for (int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j) + " ");
		}
		System.out.println();

	}

}
