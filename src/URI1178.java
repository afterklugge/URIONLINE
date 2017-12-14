import java.util.Scanner;

public class URI1178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x;
		int i;
	
		x = sc.nextFloat();
		System.out.printf("N[0] = %.4f%n", x);
		
		for(i=1; i < 100; i++) {
			x /= 2;
			System.out.printf("N[%d] = %.4f%n", i, x);
		}
	}

}
