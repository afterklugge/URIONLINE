package String;

import java.util.*;

public class RockPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String sh = sc.next();
			String rj = sc.next();

			if (sh.equals(rj)) {
				System.out.println("Tie!");
			} else {
				switch (sh) {
				case "scissors":
					if (rj.equals("paper") || rj.equals("lizard")) {
						System.out.println("sheldon");
					}
				case "paper":
					if (rj.equals("rock") || rj.equals("spock")) {
						System.out.println("sheldon");
					}
				case "rock":
					if (rj.equals("lizard") || rj.equals("scissors")) {
						System.out.println("sheldon");
					}
				case "spock":
					if (rj.equals("scissors") || rj.equals("rock")) {
						System.out.println("sheldon");
					}
				case "lizard":
					if (rj.equals("paper") || rj.equals("spock")) {
						System.out.println("sheldon");
					}
				default:
					switch (rj) {
					case "scissors":
						if (sh.equals("paper") || sh.equals("lizard")) {
							System.out.println("rajesh");
						}
					case "paper":
						if (sh.equals("rock") || sh.equals("spock")) {
							System.out.println("rajesh");
						}
					case "rock":
						if (sh.equals("lizard") || sh.equals("scissors")) {
							System.out.println("rajesh");
						}
					case "spock":
						if (sh.equals("scissors") || sh.equals("rock")) {
							System.out.println("rajesh");
						}
					case "lizard":
						if (sh.equals("paper") || sh.equals("spock")) {
							System.out.println("rajesh");
						}
					default:
						break;
					}
				}
			}
		}
	}
}