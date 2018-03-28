package Lab04;

import java.util.*;

public class Lab04Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		while (scan.hasNextInt()) {
			int x = scan.nextInt();
			list.add(x);
		}

		
		int i = 0;
		while (i < list.size()) {
			if (list.get(i) % 2 == 0) {
				list.add(i, 0);
				++i;
			}
			++i;
		}
		
        System.out.println(list);
        
		i = 0;
		while (i < list.size()) {
			if (list.get(i) % 2 != 0) {
				list.remove(i);
			} else {
				++i;
			}
		}
		
		String result = list.toString();
		System.out.println(result.replaceAll("[[,]]", ""));
		
	}

}
