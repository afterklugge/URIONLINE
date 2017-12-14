import java.util.Scanner;
public class URI1154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, counter=0;
		Scanner sc = new Scanner(System.in);
		double sum = 0, avg;
		while((x = sc.nextInt()) != 0) {
			if (x < 0) {
				break;
			}
			sum = sum + x;
			counter++;
		}
		avg = (sum / counter);
		System.out.printf("%.2f\n", avg);
	}
}
