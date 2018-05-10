package Lab06Example01;

import java.awt.*;

public class Circle extends Figure {
	private int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x - r, y - r, 2 * r, 2 * r);
	}

	@Override
	public boolean contains(int x, int y) {
		int dx = x - this.x;
		int dy = y - this.y;
		return dx * dx + dy * dy <= this.r * this.r;
	}

	@Override
	public String toString() {

		return String.format("Circle: x=%d, y=%d, r=%d", x, y, r);
	}
}