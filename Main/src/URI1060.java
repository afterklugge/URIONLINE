import java.util.Scanner;
public class URI1060 {

	public static void main(String[] args) {
		double x;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			x = sc.nextDouble();
			if(x > 0) {
				total += 1;
			}
		}
		System.out.print(total + " valores positivos\n");
	}
}
