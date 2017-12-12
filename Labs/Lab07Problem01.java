import java.util.*;

public class Lab07Problem01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Your coordinate: ");
		int x = scan.nextInt();
		
		System.out.print("Coordinate of 1st point: ");
		int x1 = scan.nextInt();
		
		System.out.print("Coordinate of 2nd point: ");
		int x2 = scan.nextInt();
		
		int d1 = abs(x1 - x);
		int d2 = abs(x2 - x);
		
		if (d1 < d2) {
			System.out.println("1st is closer. Distance: " + d1);
		} else if (d1 > d2) {
			System.out.println("2nd is closer. Distance: " + d2);
		} else {
			System.out.println("Distances are the same. Distances: " + d1);
		}
	}
	
	static int abs(int n) {
		int r = n;
		if (r < 0) {
			r = -r;
		}
		return r;
	}

}
