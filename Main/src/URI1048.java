import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) {
		double s, a;
		
		Scanner sc = new Scanner(System.in);
		s = sc.nextDouble();
		
		if (s >= 0 && s <= 400.00) {
			a = (s * 0.15);
			s = (s * 0.15)+s;
			System.out.printf("Novo salario: %.2f%n", s);
			System.out.printf("Reajuste ganho: %.2f%n", a);
			System.out.print("Em percentual: 15 %\n");
		}
		else if(s >= 400.01 && s <= 800.00) {
			a = (s * 0.12);
			s = (s * 0.12)+s;
			System.out.printf("Novo salario: %.2f%n", s);
			System.out.printf("Reajuste ganho: %.2f%n", a);
			System.out.print("Em percentual: 12 %\n");
		}
		else if(s >= 800.01 && s <= 1200.00) {
			a = (s * 0.10);
			s = (s * 0.10)+s;
			System.out.printf("Novo salario: %.2f%n", s);
			System.out.printf("Reajuste ganho: %.2f%n", a);
			System.out.print("Em percentual: 10 %\n");
		}
		else if(s >= 1200.01 && s <= 2000.00) {
			a = (s * 0.07);
			s = (s * 0.07)+s;
			System.out.printf("Novo salario: %.2f%n", s);
			System.out.printf("Reajuste ganho: %.2f%n", a);
			System.out.print("Em percentual: 7 %\n");
		}
		else {
			a = (s * 0.04);
			s = (s * 0.04)+s;
			System.out.printf("Novo salario: %.2f%n", s);
			System.out.printf("Reajuste ganho: %.2f%n", a);
			System.out.print("Em percentual: 4 %\n");
		}
	}
}
