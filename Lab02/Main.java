package Lab02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		try {
			run();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public static void run() throws Exception {
		Scanner sc = new Scanner(System.in);
		Field field = new Field();
		Turtle turtle = new Turtle(field, 0, 0, 1, false);
		UserCommand cmd = new UserCommand(sc.nextLine());
		while (cmd.getID() != UserCommand.EXIT) {
			switch (cmd.getID()) {
			case UserCommand.PEN_UP:
				turtle.penUp();
				break;
			case UserCommand.PEN_DOWN:
				turtle.penDown();
				break;
			case UserCommand.TURN_LEFT:
				turtle.turnLeft();
				break;
			case UserCommand.TURN_RIGHT:
				turtle.turnRight();
				break;
			case UserCommand.MOVE:
				turtle.move(cmd.getDist());
				break;
			case UserCommand.PRINT:
				field.print();
				break;
			}
			cmd = new UserCommand(sc.nextLine());
		}
	}
}