import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {
		int code, units, code1, units1;
		double price, price1, TOTAL;

		Scanner sc = new Scanner(System.in);
		
		code = sc.nextInt();
		units = sc.nextInt();
		price = sc.nextDouble();
		
		code1 = sc.nextInt();
		units1 = sc.nextInt();
		price1 = sc.nextDouble();
		
		TOTAL = (units * price) + (units1 * price1);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", TOTAL);
		
	}
}
