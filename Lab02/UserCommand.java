package Lab02;

import java.util.Scanner;

public class UserCommand {
	public static final int PEN_UP = 0;
	public static final int PEN_DOWN = 1;
	public static final int TURN_RIGHT = 2;
	public static final int TURN_LEFT = 3;
	public static final int MOVE = 4;
	public static final int PRINT = 5;
	public static final int EXIT = 6;

	private int id;
	private int dist;

	public UserCommand(String line) throws Exception {
		Scanner sc2 = new Scanner(line);
		String cmd = sc2.next();
		switch (cmd) {
		case "PenUp":
			id = PEN_UP;
			break;
		case "PenDown":
			id = PEN_DOWN;
			break;
		case "TurnRight":
			id = TURN_RIGHT;
			break;
		case "TurnLeft":
			id = TURN_LEFT;
			break;
		case "Move":
			id = MOVE;
			break;
		case "Print":
			id = PRINT;
			break;
		case "Exit":
			id = EXIT;
			break;
		default:
			throw new Exception("Please, write a correct command. ");
		}
		if (id == MOVE) {
			if (sc2.hasNextInt()) {
				dist = sc2.nextInt();
			} else {
				throw new Exception("Please, write a digit!");
			}
		}
		if (sc2.hasNext()) {
			throw new Exception("Please, write a correct command!");
		}
	}

	public int getID() {
		return id;
	}

	public int getDist() {
		return dist;
	}
}
