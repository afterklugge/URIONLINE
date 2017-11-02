import java.util.Scanner;
public class URI1072 {

	public static void main(String[] args) {
		int n, x, interval_start = 10, interval_end = 20;
		int in = 0, out = 0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			x = sc.nextInt();
			if (x >= interval_start && x <= interval_end) {
				in += 1;
			}
			else {
				out +=1;
			}
		}
		System.out.print(in + " in\n" + out + " out\n");
	}
}
