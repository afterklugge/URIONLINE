package String;

import java.util.*;
public class ZeroMeansZero {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.nextLine();
		while(x != 0 && y != 0) {
			String sum = Integer.toString(x + y);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < sum.length(); i++) {
				if(sum.charAt(i) != '0') {
					sb.append(sum.charAt(i));
				}
			}
			
			System.out.println(sb);
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		
	}
}