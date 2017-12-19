import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project01Problem05 extends JFrame {
	String title = "Graphics Template";
	Color background = Color.BLACK;

	void draw(Graphics g) {
		// your code...
		int w = getWidth();
		int h = getHeight();
		int wx = w / 2;
		int hx = h / 2;
		int x = wx;
		int y = hx;
		int degree = 36;
		for (int i = 0; i < 10; i++) {
			double x1 = x + 300 * Math.cos(Math.toRadians(degree));// 0.62
			double y1 = y + 300 * Math.sin(Math.toRadians(degree));// 0.62
			degree += 36;
			double x2 = x + 300 * Math.cos(Math.toRadians(degree));// 0.62
			double y2 = y + 300 * Math.sin(Math.toRadians(degree));
			g.setColor(Color.red);
			g.drawLine(x, y, (int) x1, (int) y1);
			g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
		}
	}

	public Project01Problem05() {
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

		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project01Problem05();
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
