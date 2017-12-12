import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project02Help01 extends JFrame {
	String title = "Animation Template";
	Color background = Color.BLACK;
	int delay = 10;

	// Your variables...
	Random rnd = new Random();

	int n = 50;

	int[] x = new int[n];
	int[] y = new int[n];
	int[] dx = new int[n];
	int[] dy = new int[n];
	Color[] c = new Color[n];
	
	int r;

	int w;
	int h;

	void start() {
		w = getWidth();
		h = getHeight();

		for (int i = 0; i < n; ++i) {
			x[i] = w / 2;
			y[i] = h / 2;
			r = 30;
			dx[i] = -10 + rnd.nextInt(20);
			dy[i] = -10 + rnd.nextInt(20);
			c[i] = new Color(rnd.nextInt(256), rnd.nextInt(256),
					         rnd.nextInt(256), rnd.nextInt(100)); 
		}
	}

	void update() {
		for (int i = 0; i < n; ++i) {
			if (x[i] + r + dx[i] > w) {
				x[i] = w - r;
				dx[i] = -dx[i];
			}
			if (x[i] - r + dx[i] < 0) {
				x[i] = r;
				dx[i] = -dx[i];
			}
			if (y[i] + r + dy[i] > h) {
				y[i] = h - r;
				dy[i] = -dy[i];
			}
			if (y[i] - r + dy[i] < 0) {
				y[i] = r;
				dy[i] = -dy[i];
			}
			x[i] += dx[i];
			y[i] += dy[i];
		}

	}

	void draw(Graphics g) {
		for (int i = 0; i < n; ++i) {
			g.setColor(c[i]);
			g.fillOval(x[i] - r, y[i] - r, 2 * r, 2 * r);
		}
	}

	public Project02Help01() {
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
		new Project02Help01();
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
