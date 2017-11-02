import java.util.Scanner;
public class URI1064 {

	public static void main(String[] args) {
		double x, total = 0, average = 0;
		int totalNumber = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			x = sc.nextDouble();
			if(x > 0) {
				total += x;
				totalNumber += 1;
			}
		}
		
		average = total / totalNumber;
		
		System.out.print(totalNumber + " valores positivos\n");
		System.out.printf("%.1f%n", average);
	}
}
