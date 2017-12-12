import java.util.*;

public class Lab05Example01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double sum = 0.0;
		int count = 0;

		System.out.print("Enter grades (0 to stop): ");
		
		int g = scan.nextInt();
		while (g != 0) {
			sum += g;
			++count;
			g = scan.nextInt();
		}

		if (count != 0) {
			System.out.printf("The arithmetic mean is %.1f%n", sum / count);
		} else {
			System.out.println("No data");
		}
	}

}
