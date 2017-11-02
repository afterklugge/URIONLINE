import java.util.Scanner;
public class URI1045 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (a >= (b+c)) {
			System.out.print("NAO FORMA TRIANGULO");
		}
		else if (a*a == (b*b)+(c*c)) {
			System.out.print("TRIANGULO RETANGULO");
		}
		else if (a*a > (b*b)+(c*c)) {
			System.out.print("TRIANGULO OBTUSANGULO");
		}
		else if (a*a < (b*b)+(c*c)) {
			System.out.print("TRIANGULO ACUTANGULO");
		}
		else if ( a == b && b == c) {
			System.out.print("TRIANGULO EQUILATERO");
		}
		else {
			System.out.print("TRIANGULO ISOSCELES");
	}
  }
}

