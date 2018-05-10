
public class Player {
	private int row;
	private int col;

	public Player(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int getCol() {
		return col;
	}

	public int getRow() {
		return row;
	}

	public void moveUp() {
		if (row > 0)
			row--;

	}

	public void moveDown() {
		if (row < 7)
			row++;
	}

	public void moveLeft() {
		if (col > 0)
			col--;
	}

	public void moveRight() {
		if (col < 7) {
			col++;
		}
	}
}
