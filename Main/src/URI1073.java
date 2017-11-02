import java.util.Scanner;
public class URI1073 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		for(int i = 2; i <= x; i+=2) {
			System.out.print(i + "^2 = " + (i*i)+"\n");
		}
	}
}
