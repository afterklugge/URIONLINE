import java.util.Scanner;
public class URI1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		while(!((x = sc.nextInt()) == (y = sc.nextInt()))) {
			
			if(x > y) {
				System.out.println("Decrescente");
			}
			if(x < y) {
				System.out.println("Crescente");
			}
		}
	}
}
