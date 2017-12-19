
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project01Problem06 extends JFrame {
	String title = "Graphics Template";
	Color background = Color.BLACK;

	void draw(Graphics g) {
		// your code...
		int w = getWidth();
		int h = getHeight();

		final int m = 26;

		int wx = w / 2;
		int hx = h / 2;
		double ang = 0;
		double degree = 0;
		int d1 = 12;
		int d2 = 13;
		int d3 = 14;
		for (int i = 0; i < m; i++) {
			double xend1 = wx + 400 * Math.cos(Math.toRadians(ang));// 0.62
			double yend1 = hx + 400 * Math.sin(Math.toRadians(ang));
			ang += 13.846;
			g.setColor(Color.RED);
			g.drawLine(wx, hx, (int) xend1, (int) yend1);
			int xr1 = (int) (wx + 400 * Math.cos(Math.toRadians(13.864 * d1)));
			int yr1 = (int) (hx + 400 * Math.sin(Math.toRadians(13.864 * d1)));
			int xr2 = (int) (wx + 400 * Math.cos(Math.toRadians(13.864 * d2)));
			int yr2 = (int) (hx + 400 * Math.sin(Math.toRadians(13.864 * d2)));
			int xr3 = (int) (wx + 400 * Math.cos(Math.toRadians(13.864 * d3)));
			int yr3 = (int) (hx + 400 * Math.sin(Math.toRadians(13.864 * d3)));
			g.drawLine((int) (wx + 400 * Math.cos(Math.toRadians(degree))),
					(int) (hx + 400 * Math.sin(Math.toRadians(degree))), xr1, yr1);
			g.drawLine((int) (wx + 400 * Math.cos(Math.toRadians(degree))),
					(int) (hx + 400 * Math.sin(Math.toRadians(degree))), xr2, yr2);
			g.drawLine((int) (wx + 400 * Math.cos(Math.toRadians(degree))),
					(int) (hx + 400 * Math.sin(Math.toRadians(degree))), xr3, yr3);
			degree += 13.864;
			d1++;
			d2++;
			d3++;
		}

	}

	public Project01Problem06() {
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
		new Project01Problem06();
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