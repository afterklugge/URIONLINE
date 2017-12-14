import java.util.Scanner;

public class URI1117 {

	public static void main(String[] args) {
		
		double x, total = 0, numberOfStudents = 0;
		Scanner sc = new Scanner(System.in);

		while (numberOfStudents != 2) {
			x = sc.nextDouble();
			if (x >= 0.0 && x <= 10.0) {
				total += x;
				numberOfStudents++;
			} else {
				System.out.print("nota invalida\n");
			}
		}
		double average =  total / 2;
		System.out.printf("%.2f\n", average);
	}
}
