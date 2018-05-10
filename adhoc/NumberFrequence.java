package adhoc;

import java.util.*;

public class NumberFrequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int poo = sc.nextInt();
			a.add(a.size() - 1);
		}

		for (int i = 0; i < a.size(); i++) {
			if (!a.isEmpty()) {
				System.out.println((i + 1) + " aparece" + a.get(i) + " vez(es)");
			}
		}
	}

}
