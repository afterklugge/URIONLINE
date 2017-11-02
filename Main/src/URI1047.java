import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {
		int startHour, endHour, stMint, endMint, hours;
		
		Scanner sc = new Scanner(System.in);
		startHour = sc.nextInt();
		stMint = sc.nextInt();
		endHour = sc.nextInt();
		endMint = sc.nextInt();
		
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
