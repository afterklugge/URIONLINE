package Lab04;

import java.util.*;

public class Lab04Example03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayListInt list = new ArrayListInt();

		while (sc.hasNextInt()) {
			int N = sc.nextInt();
			list.add(N);
		}

		System.out.println("Before reversing: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		for (int p = 0, q = list.size() - 1; p < q; p++, q--) {
			int t = list.get(p);
			list.set(p, list.get(q));
			list.set(q, t);
		}
		System.out.println("After reversing: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
