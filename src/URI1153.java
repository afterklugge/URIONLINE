import java.util.Scanner;
public class URI1153 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		int factorial = 1;
		
		for(int i = 1; i <= x; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
}
