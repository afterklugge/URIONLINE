package String;

import java.util.*;

public class BloggoShortcuts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String text = sc.nextLine();

			ArrayList<Character> a = new ArrayList<Character>();
			for (int i = 0; i < text.length(); i++) {
				a.add(text.charAt(i));
			}
			int index = 0;
			int bold = 0;
			int italic = 0;

			while (a.size() > 0) {
				if (a.get(index) != '_' && a.get(index) != '*') {
					System.out.print(a.get(index));
					a.remove(index);
				} else {
					if (a.get(index) == '_' && italic % 2 == 0) {
						System.out.print("<i>");
						a.remove(index);
						italic++;
					} else if (a.get(index) == '_' && italic % 2 != 0) {
						System.out.print("</i>");
						a.remove(index);
						italic++;
					} else if (a.get(index) == '*' && bold % 2 == 0) {
						System.out.print("<b>");
						a.remove(index);
						bold++;
					} else if (a.get(index) == '*' && bold % 2 != 0) {
						System.out.print("</b>");
						a.remove(index);
						bold++;
					}
				}
			}
			System.out.println();
		}
	}
}