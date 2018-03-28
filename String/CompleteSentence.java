package String;

import java.util.*;

public class CompleteSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		int sum;
		
		for (int i = 0; i < n; i++) {
			sum = 0;
			int[] alphabet = new int[26];
			String text = sc.nextLine();
			char[] getArray = text.toCharArray();
			for (int j = 0; j < getArray.length; j++) {
				if(Character.isLetter(getArray[j])) {
					alphabet[getArray[j] - 97] = 1;
				}
			}
			for (int j = 0; j < alphabet.length; j++) {
				sum += alphabet[j];
			}

			if(sum == 26) {
				System.out.println("frase completa");
			}  else if(sum < 13){
				System.out.println("frase mal elaborada");
			} else {
				System.out.println("frase quase completa");
			}
			
			
		}
	}

}
