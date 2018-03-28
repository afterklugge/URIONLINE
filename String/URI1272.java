package String;

import java.util.Scanner;


public class URI1272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String input = sc.nextLine().trim();
			char[] inputArr = input.toCharArray();
			
			String result = "";
			
			if (inputArr.length != 0)
			{
				result += inputArr[0];
				for (int j = 1; j < inputArr.length; j++) {
					if (inputArr[j] == ' ' && inputArr[j + 1] != ' ') {
						result += inputArr[j + 1];
					}
				}
			}
			
			System.out.println(result);
		}
		
	}

}
