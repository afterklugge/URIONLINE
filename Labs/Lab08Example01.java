import java.util.*;

public class Lab08Example01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random rnd = new Random();

		System.out.print("N? ");
		int n = scan.nextInt();

		int[] c = new int[13];
		
		for (int i = 0; i < n; ++i) {
			int d1 = 1 + rnd.nextInt(6);
			int d2 = 1 + rnd.nextInt(6);
			++c[d1 + d2];
		}
		
		for (int i = 2; i < c.length; ++i) {
			System.out.println(i + ": " + c[i]);
		}
	}

}
