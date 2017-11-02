import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

        if (a > b && a > c) {
        	System.out.println(a + " eh o maior");
        }
        else if (b > a && b > c) {
        	System.out.println(b + " eh o maior");
        }
        else if (c > a && c > b) {
        	System.out.println(c + " eh o maior");
        }
	}
}