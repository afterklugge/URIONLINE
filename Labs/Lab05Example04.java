import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Lab05Example04 extends JFrame {
	String title = "Graphics Template";
	Color background = Color.BLACK;

	void draw(Graphics g) {
		// your code...
		Random rnd = new Random();
		
		int w = getWidth();
		int h = getHeight();

		for (int i = 0; i < 100; ++i) {
			int x = rnd.nextInt(w);
			int y = rnd.nextInt(h);
			int r = 10 + rnd.nextInt(40);
			int rc = rnd.nextInt(256);
			int gc = rnd.nextInt(256);
			int bc = rnd.nextInt(256);
			g.setColor(new Color(rc, gc, bc));
			g.fillOval(x - r, y - r, 2 * r, 2 * r);
		}
	}

	public Lab05Example04() {
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
		new Lab05Example04();
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
