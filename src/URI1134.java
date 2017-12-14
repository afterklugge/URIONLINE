import java.util.Scanner;
public class URI1134 {

	public static void main(String[] args) {
		int x = 0;
		int alcohol = 0, gasoline = 0, diesel = 0, end = 4;
		Scanner sc = new Scanner(System.in);
		
		while(x != 4) {
			x = sc.nextInt();
			if (x == end) {
				break;
			}
			else if(x == 1) {
				alcohol+=1;
			}
			else if (x == 2) {
				gasoline+=1;
			}
			else if (x == 3) {
				diesel+=1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcohol);
		System.out.println("Gasolina: " + gasoline);
		System.out.println("Diesel: " + diesel);
	}

}
