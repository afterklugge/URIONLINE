import java.util.Scanner;
public class URI1043 {

	public static void main(String[] args) {
		float a, b, c, perimeter, area;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		perimeter = a + b + c;
		area = ((a+b)/2) * c;
		
		if (a < (b+c) && b < (a+c) && c < (a+b)) {
			System.out.println("Perimetro = " + perimeter);
		}
		else {
			System.out.println("Area = " + area);
		}
	}
}
