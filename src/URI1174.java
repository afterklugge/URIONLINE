import java.util.Scanner;

public class URI1174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] <= 0) {
				arr[i] = 1;
			}
			System.out.printf("X[%d] = %d\n", i, arr[i]);
		}
	}
}
