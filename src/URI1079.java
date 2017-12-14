import java.util.Scanner;
public class URI1079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			double average = ((a*2) + (b*3) + (c*5)) / 10;
			System.out.printf("%.1f\n", average);
		}
	}

}
