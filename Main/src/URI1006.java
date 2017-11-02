import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) {
double A, B, C, MEDIA;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		MEDIA = ((A*2) + (B*3) + (C*5)) / 10;

		System.out.printf("MEDIA = %.1f%n", MEDIA);
	}

}
