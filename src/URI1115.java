import java.util.Scanner;
public class URI1115 {

	public static void main(String[] args) {
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		while(((x = sc.nextInt()) != 0) || ((y = sc.nextInt()) != 0)) {
		if(x > 0 && y > 0) {
			System.out.println("primeiro");
		} 
		else if(x > 0 && y < 0) {
			System.out.println("quarto");
		}
		else if(x < 0 && y < 0) {
			System.out.println("terceiro");
		}
		else if (x < 0 && y > 0) {
			System.out.println("segundo");
		}
	 }
	}

}
