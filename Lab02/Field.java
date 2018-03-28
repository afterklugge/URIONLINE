package Lab02;

public class Field {
	final int SIZE = 20;
	char[][] data = new char[SIZE][SIZE];

	public Field() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				data[i][j] = '.';
			}
		}
	}

	public void print() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}

	public void set(int row, int col, char c) {
		data[row][col] = c;
	}
}
