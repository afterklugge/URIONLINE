import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Lab05Example05 extends JFrame {
	String title = "Graphics Template";
	Color background = Color.BLACK;

	void draw(Graphics g) {
		// your code...
		int w = getWidth();
		int h = getHeight();
		int n = 5;
		int r = Math.min(w, h) / 2;
		int dr = r / n;
		int c = 5;
		int dc = 250 / n;
		for (int i = 0; i < n; ++i) {
			g.setColor(new Color(c, 0, 0));
			g.fillOval(w / 2 - r, h / 2 - r, 2 * r, 2 * r);
			r -= dr;
			c += dc;
		}
	}

	public Lab05Example05() {
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
		new Lab05Example05();
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
