import java.util.Scanner;

public class URI1143 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		int square;
		int cubic;
		x = sc.nextInt();
		
		if(x > 1 && x < 1000) {
			for(int i=1; i <= x; i++) {
				square = (int) Math.pow(i, 2);
				cubic = (int) Math.pow(i, 3);
				
				System.out.printf("%d %d %d%n", i, square, cubic);
			}
		}
	}

}
