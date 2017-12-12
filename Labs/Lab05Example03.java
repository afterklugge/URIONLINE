import java.util.*;

public class Lab05Example03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number of tests: " );
		int n = scan.nextInt();
		
		Random rnd = new Random();
		
		int correct = 0;
		
//		int i = 0;
//		while (i < n) {
//			int a = -50 + rnd.nextInt(100);
//			int b = -50 + rnd.nextInt(100);
//			System.out.print(a + " + " + b + " = ");
//			int c = scan.nextInt();
//			correct += (a + b == c) ? 1: 0;
//			++i;
//		}
		
		for (int i = 0; i < n; ++i) {
			int a = -50 + rnd.nextInt(100);
			int b = -50 + rnd.nextInt(100);
			System.out.print(a + " + " + b + " = ");
			int c = scan.nextInt();
			correct += (a + b == c) ? 1: 0;
		}
		
		int incorrect = n - correct;
		System.out.println("Correct answers: " + correct);
		System.out.println("Incorrect answers: " + incorrect);
		
	}

}
