import java.util.Scanner;
public class URI1046 {

	public static void main(String[] args) {
		int start, end, hours;
		
		Scanner sc = new Scanner(System.in);
		start = sc.nextInt();
		end = sc.nextInt();
		
		hours = end - start;
		
		if (hours < 0) {
			hours = 24 + (end - start);
		}
		if (start == end)  {
			System.out.printf("O JOGO DUROU 24 HORA(S)\n");
		}
		else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", hours);
		}
	}

}