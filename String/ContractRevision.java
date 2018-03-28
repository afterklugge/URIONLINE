package String;

import java.util.*;
import java.util.Arrays;

public class ContractRevision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String count = sc.nextLine();
			String numbers = sc.next();
			if(count.equals("0") && numbers.equals("0")) {
				break;
			}
			System.out.println(fixNum(count, numbers));
		}
	}

	private static String fixNum(String count, String numbers) {
		String result = numbers.replaceAll(count, "");
		while (result.indexOf("0") == 0) {
			result = result.replaceFirst("0", "");
		}
		if (result.isEmpty()) {
			result = "0";
		}
		return result;

	}
}