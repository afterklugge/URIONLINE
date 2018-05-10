package adhoc;

import java.util.*;

public class JosephusLegend {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();
		for (int i = 0; i < cases; ++i) {
			int n = scan.nextInt();
			int k = scan.nextInt();

			System.out.printf("Case %d: %d\n", i + 1, result(n, k) + 1);
		}

	}

	public static int result(int n, int k) {
		int res = 0;
		for (int i = 2; i <=n; i++) {
			res = (res + k) % i;
		}
		return res;
		
	}

}
