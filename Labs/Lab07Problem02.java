import java.util.Scanner;

public class Lab07Problem02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Year? ");
		int y = scan.nextInt();

		System.out.print("Month? ");
		int m = scan.nextInt();

		int d = getNumberOfDays(y, m);
		
		System.out.println("Number of days: " + d);
	}

	static int getNumberOfDays(int y, int m) {
		switch (m) {
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			return isLeapYear(y) ? 29: 28;
		}
		return 0;
	}
	
	static boolean isLeapYear(int y) {
		return (y % 400 == 0 || y % 4 == 0 && y % 100 != 0);
	}


}
