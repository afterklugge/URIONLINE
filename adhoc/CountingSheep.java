package adhoc;

import java.util.*;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {

			int numberOfSheep = sc.nextInt();

			Set<Integer> set = new HashSet<Integer>();

			for (int j = 0; j < numberOfSheep; j++) {
				int sheep = sc.nextInt();
				set.add(sheep);
			}
			System.out.println(set.size());
		}
	}

}
