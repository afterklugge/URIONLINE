package String;
import java.util.*;
public class URI1238 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			String first = sc.next();
			String second = sc.next();
			
			char[] firstArr = first.toCharArray();
			char[] secondArr = second.toCharArray();
			
			String result = "";
			
			if(firstArr.length == secondArr.length) {
				for (int j = 0; j < secondArr.length; j++) {
					result += firstArr[j];
					result += secondArr[j];
				}
			}
			
			if(firstArr.length > secondArr.length) {
				for (int j = 0; j < secondArr.length; j++) {
					result += firstArr[j];
					result += secondArr[j];
				}
				for (int j = secondArr.length; j < firstArr.length; ++j)
				{				
					result += firstArr[j];
				}
			}
			
			if(firstArr.length < secondArr.length) {
				for (int j = 0; j < firstArr.length; j++) {
					result += firstArr[j];
					result += secondArr[j];
				}
				for (int j = firstArr.length; j < secondArr.length; ++j) {
					result += secondArr[j];
				}
			}
			
			System.out.println(result);
		}
	}

}
