import java.util.Scanner;
public class URI1080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0, position = 0;
		
		for(int i = 1; i <= 100; i++) {
			int numbers  = sc.nextInt();
			if(max < numbers) {
				max = numbers;
				position = i;
			}
		}
		System.out.printf("%d\n%d\n", max, position);
	}
}
