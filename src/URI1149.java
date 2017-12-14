import java.util.Scanner;

public class URI1149 {

	public static void main(String[] args) {
		int a, n, sum=0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		n = sc.nextInt();

		for(int i = a, totalNumber = 0; totalNumber < n; i++) {
			sum+= i;
			totalNumber += 1;
		}
		System.out.println(sum);
	}
}
