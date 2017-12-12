import java.util.*;

public class Lab05Example02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Integer? ");
		int n = scan.nextInt();
		
		int s = 0;
		while (n != 0) {
			s += n % 10;
			n /= 10;
		}
		
		System.out.println("Sum of all digits is " + s);
	}

}
