
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project02Problem03 extends JFrame {
	String title = "Animation Template";
	Color background = Color.BLACK;
	int delay = 10;

	// Your variables...
	int w;
	int h;

	int xc;
	int yc;
	int r1;

	int x;
	int y;
	int r2;

	int r3;

	double alpha;
	double da;

	void start() {
		// your code...
		w = getWidth();
		h = getHeight();

		xc = w / 2;
		yc = h / 2;
		
		r1 = Math.min(w, h) / 5;
		r3 = Math.min(w, h) / 3;

		x = xc + r3;
		y = yc;
		r2 = r1 / 3;

		alpha = 0;
		da = -0.1;

	}

	void update() {
		// your code...
		alpha += da;
		x = (int) (xc + r3 * Math.cos(alpha));
		y = (int) (yc + r3 * Math.sin(alpha));
	}

	void draw(Graphics g) {
		// your code...
		g.setColor(Color.RED);
		g.fillOval(xc - r1, yc - r1, 2 * r1, 2 * r1);
		g.setColor(Color.BLUE);
		g.fillOval(x - r2, y - r2, 2 * r2, 2 * r2);
	}

	public Project02Problem03() {
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
		new Project02Problem03();
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
