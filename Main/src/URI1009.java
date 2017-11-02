import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		String name;
		double salary, sales, TOTAL;
		
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		salary = sc.nextDouble();
		sales = sc.nextDouble();
		
		TOTAL = salary + (sales * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
		
	}

}
