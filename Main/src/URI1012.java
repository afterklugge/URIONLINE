import java.util.Scanner;

public class URI1012 {

	public static void main(String[] args) {
		double a, b, c;
		double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		TRIANGULO = (a * c) / 2;
		CIRCULO =  (3.14159 * c * c);
		TRAPEZIO =  ((a + b)/2)*c;
		QUADRADO = (b * b);
		RETANGULO = (a*b);

		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n", QUADRADO);
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);
	}

}
