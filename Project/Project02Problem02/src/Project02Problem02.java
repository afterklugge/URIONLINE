
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project02Problem02 extends JFrame {
	String title = "Animation Template";
	Color background = Color.BLACK;
	int delay = 10;

	// Your variables...
	int w, h;

	int x, y, r;
	int x1, y1, x2, x3, y2, y3;
	int xspeed, x2speed, x3speed;
	int yspeed, y2speed, y3speed;

	void start() {
		// your code...
		xspeed = 1;
		yspeed = 1;
		x2speed = 1;
		y2speed = 1;
		x3speed = 1;
		y3speed = 1;

		w = getWidth();
		h = getHeight();
		x1 = w / 2;
		y1 = h / 2;

		x2 = w / 2 - 40;
		y2 = h / 2 + 40;

		x3 = w / 2 - 80;
		y3 = h / 2 + 80;
		r = 20;

	}

	void update() {

		x1 += xspeed;
		y1 -= yspeed;
		x2 += x2speed;
		y2 -= y2speed;
		x3 += x3speed;
		y3 -= y3speed;

		if (y1 == h || y1 == 0) {
			yspeed *= -1;
		}
		if (x1 == w || x1 == 0) {
			xspeed *= -1;
		}
		if (x2 == w || x2 == 0) {
			x2speed *= -1;
		}
		if (y2 == h || y2 == 0) {
			y2speed *= -1;
		}
		if (x3 == w || x3 == 0) {
			x3speed *= -1;
		}
		if (y3 == h || y3 == 0) {
			y3speed *= -1;

		}
	}

	void draw(Graphics g) {
		// your code...

		g.setColor(Color.RED);
		g.fillOval(x1, y1, r * 2, r * 2);
		g.setColor(Color.GREEN);
		g.fillOval(x2, y2, r * 2, r * 2);
		g.setColor(Color.BLUE);
		g.fillOval(x3, y3, r * 2, r * 2);

	}

	public Project02Problem02() {
		setTitle(title);
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DrawPanel panel = new DrawPanel();

		panel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.exit(0);
			}
		});

		add(panel);

		javax.swing.Timer timer = new javax.swing.Timer(delay, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
				repaint();
			}
		});

		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);

		start();

		timer.start();
	}

	public static void main(String[] args) {
		new Project02Problem02();
	}

	class DrawPanel extends JPanel {
		public DrawPanel() {
			setBackground(background);
			setFocusable(true);
			requestFocusInWindow();
			setDoubleBuffered(true);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			draw(g);
		}
	}
}
