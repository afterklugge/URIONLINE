import java.util.Scanner;
import java.util.Arrays;

public class URI1042 {

	public static void main(String[] args) {
		int x[] = {};
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int x[] = new int[3];
		for (int i = 0; i<3; i++) {
			x[i] = sc.nextInt();
		}
 }
}


import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x[] = new int[3];
		int y[] = new int[3];
		
		for (int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = x[i];
		}
		Arrays.sort(x);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(y[i]);
		}
	}
}
