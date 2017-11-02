import java.util.Scanner;
public class URI1066 {

	public static void main(String[] args) {
		int x, even= 0, odd = 0, positive = 0, negative= 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			x = sc.nextInt();
			if (x % 2 == 0) {
				even += 1;
			}
			else {
				odd += 1;
			}
			
			if(x > 0) {
				positive += 1;
			}
			if(x < 0) {
				negative += 1;
			}	
		}
		
		System.out.printf("%d valor(es) par(es)\n", even);
		System.out.printf("%d valor(es) impar(es)\n", odd);
		System.out.printf("%d valor(es) positivo(s)\n", positive);
		System.out.printf("%d valor(es) negativo(s)\n", negative);
	}
}
