import java.util.Scanner;
public class URI1020 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		System.out.println( x / 365 + " ano(s)");
		System.out.println(x % 365 / 30 + " mes(es)");
		System.out.println(x %365%30 + " dia(s)");

	}
}
