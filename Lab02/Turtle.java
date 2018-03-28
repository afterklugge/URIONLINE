package Lab02;

public class Turtle {
	private Field field;
	int row, col, dir;
	boolean isPenDown;

	public Turtle(Field aField, int aRow, int aCol, int aDir, boolean PenDown) {
		field = aField;
		row = aRow;
		col = aCol;
		dir = aDir;
		PenDown = isPenDown;
	}

	public void move(int steps) throws Exception {
		for (int i = 0; i < steps; i++) {
			if (isPenDown) {
				field.set(row, col, '*');
			}
			switch (dir) {
			case 0:
				row--;
				break;
			case 1:
				col++;
				break;
			case 2:
				row++;
				break;
			case 3:
				col--;
				break;
			}
			if (steps < 0) {
				throw new Exception("The steps cannot be negative!");
			}
			if (row < 0 || row >= field.SIZE || col < 0 || col >= field.SIZE) {
				throw new Exception("You are out of array! Please try to contain all letters!");
			}
		}
	}

	public void turnRight() {
		dir++;
		if (dir == 4) {
			dir = 0;
		}
	}

	public void turnLeft() {
		dir--;
		if (dir == -1) {
			dir = 3;
		}
	}

	public void penDown() {
		isPenDown = true;
	}

	public void penUp() {
		isPenDown = false;
	}

}
