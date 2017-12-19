import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project01Problem04 extends JFrame {

	String title = "Graphics Template";
	Color background = Color.BLACK;

	void draw(Graphics g) {
		final int N = 8;
		int w = getWidth();
		int h = getHeight();
		
		int row;
		
		int col;
		int x, y;
		int r = h/8;
		int r1 = w/4;

		for (row = 0; row < N; row++) {
			for (col = 0; col < N; col++) {
				x = col*70;
				y = row*70;
				if ((row % 2) == (col % 2)) {
					g.setColor(Color.red);
				} else
					g.setColor(Color.blue);
				g.fillRect(x + r1, y + r, 70, 70);
			}

		}

	}

	public Project01Problem04() {
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
		new Project01Problem04();
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
