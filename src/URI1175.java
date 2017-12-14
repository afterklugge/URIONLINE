import java.util.Scanner;

public class URI1175 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[20], temp, i, j;
		Scanner sc = new Scanner(System.in);

		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (i = 0, j = 19; i < 10; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (i = 0; i < 20; i++) {
			System.out.printf("N[%d] = %d\n", i, arr[i]);
		}

	}
}
