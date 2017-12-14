import java.util.Scanner;

public class URI1151 {

	public static void main(String[] args) {
		int count, num1 = 0, num2 = 1;

		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		
		
		System.out.print("0 ");
		for (int i = 1; i < count; i++) {
			int sumOfPrevTwo = num1 + num2; //2 //3 //5
			num1 = num2; // 1 //2 //3
			num2 = sumOfPrevTwo; //2 //3
			System.out.print(num1 + " "); //1 1 //2 //3
		}
		System.out.print("\n");
	}

}
