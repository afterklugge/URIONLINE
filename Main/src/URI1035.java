import java.util.Scanner;

public class URI1035 {

	public static void main(String[] args) {
		int A, B, C, D;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		if (B > C && D > A && (C+D) > (A+B) && C > 0 && D % 2 == 0) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
	}

}
