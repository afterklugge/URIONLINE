package Lab01;

import java.util.Scanner;

public class Lab01Example01 {

	static final int PEN_UP = 0;
	static final int PEN_DOWN = 1;
	static final int TURN_RIGHT = 2;
	static final int TURN_LEFT = 3;
	static final int MOVE = 4;
	static final int PRINT = 5;
	static final int EXIT = 6;

	static final int SIZE = 20;
	static char[][] field = new char[SIZE][SIZE];
	static int turtleRow;
	static int turtleCol;
	static int turtleDir;
	static boolean isPenDown;

	static int commandId;
	static int commandDist;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		try {
			run();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void run() throws Exception {
		init();
		readNextCommand();
		while (commandId != EXIT) {
			switch (commandId) {
			case PEN_UP:
				penUp();
				break;
			case PEN_DOWN:
				penDown();
				break;
			case TURN_LEFT:
				turnLeft();
				break;
			case TURN_RIGHT:
				turnRight();
				break;
			case MOVE:
				move(commandDist);
				break;
			case PRINT:
				printField();
				break;
			default:
				throw new Exception("Please, write correct ID!");
			}
			readNextCommand();
		}
	}

	private static void readNextCommand() throws Exception {
		String line = sc.nextLine();
		Scanner sc2 = new Scanner(line);

		String cmd = sc2.next();
		switch (cmd) {
		case "PenUp":
			commandId = PEN_UP;
			break;
		case "PenDown":
			commandId = PEN_DOWN;
			break;
		case "TurnRight":
			commandId = TURN_RIGHT;
			break;
		case "TurnLeft":
			commandId = TURN_LEFT;
			break;
		case "Move":
			commandId = MOVE;
			break;
		case "Print":
			commandId = PRINT;
			break;
		case "Exit":
			commandId = EXIT;
			break;
		default:
			throw new Exception("It is not correct id: " + line);
		}
		if (commandId == MOVE) {
			if (sc2.hasNextInt()) {
				commandDist = sc2.nextInt();
			} else {
				throw new Exception("Please, write a digit! " + commandDist);
			}
			if (commandDist < 0) {
				throw new Exception("The distance cannot be negative!");
			}
		}
		if (sc2.hasNext()) {
			throw new Exception("Write a correct id please!");
		}
	}

	private static void turnLeft() {
		turtleDir--;
		if (turtleDir == -1) {
			turtleDir = 3;
		}
	}

	private static void turnRight() {
		turtleDir++;
		if (turtleDir == 4) {
			turtleDir = 0;
		}
	}

	private static void move(int steps) throws Exception {
		for (int i = 0; i < steps; i++) {
			if (isPenDown) {
				field[turtleRow][turtleCol] = '*';
			}
			switch (turtleDir) {
			case 0:
				turtleRow--;
				break;
			case 1:
				turtleCol++;
				break;
			case 2:
				turtleRow++;
				break;
			case 3:
				turtleCol--;
				break;
			}
			if (turtleRow < 0 || turtleRow >= SIZE || turtleCol < 0 || turtleCol >= SIZE) {
				throw new Exception("You are out of field");
			}
		}
	}

	private static void penDown() {
		isPenDown = true;
	}

	private static void penUp() {
		isPenDown = false;
	}

	private static void init() {
		turtleRow = 0;
		turtleCol = 0;
		turtleDir = 1;
		isPenDown = false;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				field[i][j] = '.';
			}
		}
	}

	private static void printField() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
	}
}
