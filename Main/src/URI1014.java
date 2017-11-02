import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();
		x= x/y;
		System.out.printf("%.3f km/l%n", x);
	}
}