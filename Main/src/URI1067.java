import java.util.Scanner;
public class URI1067 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.print(1+"\n");
		
		if(x >= 1 && x <= 1000) {
			for(int i = 1; i < x -1; i+= 2) {
				int oddNumber = i + 2;
				System.out.print(oddNumber+"\n");
			}
	   }
   }
}
