import java.util.Scanner;

public class URI1078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n;
	n = sc.nextInt();
	
	for(int i = 1; i <= 10; i++) {
		int a = i * n;
		System.out.println(i + " x " + n + " = " + a);
	}
	}
}
