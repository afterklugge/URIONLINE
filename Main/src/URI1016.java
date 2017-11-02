import java.util.Scanner;

public class URI1016 {
	
	public static void main(String[] args) {
	
		int d;
		
		Scanner sc = new Scanner(System.in);
		d = sc.nextInt();
		
		int t = (d / ((90 / 60) - (60 / 60)));
		
		System.out.printf("%d minutos\n", t);
		}

}