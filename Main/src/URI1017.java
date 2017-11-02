import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		double h, s, distance;
		
		Scanner sc = new Scanner(System.in);
		h = sc.nextDouble();
		s = sc.nextDouble();
		
		distance = (h * s) / 12;
		
		System.out.printf("%.3f%n", distance);
		
	}
}
