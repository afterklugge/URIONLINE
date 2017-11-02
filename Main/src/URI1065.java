import java.util.Scanner;
public class URI1065 {

	public static void main(String[] args) {
		int x, total=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			x = sc.nextInt();
			if (x % 2 == 0) {
				total += 1;
			}
		}
		System.out.printf("%d valores pares\n", total);
	}
}
