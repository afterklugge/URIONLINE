import java.util.Scanner;

public class URI1044 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos\n");
	}
		else{
			System.out.println("Nao sao Multiplos\n");  
		}
  }
}
