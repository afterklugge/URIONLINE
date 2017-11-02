import java.util.Scanner;
public class URI1051 {

	public static void main(String[] args) {
		double salary;
		
		Scanner sc = new Scanner(System.in);
		salary = sc.nextDouble();
		
		if (salary >= 0 && salary <= 2000.00) {
			System.out.printf("Isento\n");
		}
		else if (salary >= 2000.01 && salary <= 3000.00) {
			System.out.printf("R$ %.2f%n", (salary - 2000.00)*0.08);
		}
		else if (salary >= 3000.01 && salary <= 4500.00) {
			System.out.printf("R$ %.2f%n", (salary - 3000.00)*0.18 + 1000.00*0.08);
		}
		else if (salary >= 4500.01) {
			System.out.printf("R$ %.2f%n", (salary - 4500.00)*0.28 + 1500.00*0.18 + 1000.00*0.08);
		}
	}
}
