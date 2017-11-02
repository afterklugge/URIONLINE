import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		
		int NUMBER, HOURS;
		double SALARY;
		
		Scanner sc = new Scanner(System.in);
		NUMBER = sc.nextInt();
		HOURS = sc.nextInt();
		SALARY = sc.nextDouble();
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", (HOURS * SALARY));
	}

}
