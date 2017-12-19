	import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project02Problem04 extends JFrame {
	String title = "Animation Template";
	Color background = Color.BLACK;
	int delay = 10;

	// Your variables...
	int x1, y1;
	int xc; 
	int H, d, height;
	double alpha, k;

	void start() {
		x1 = 0;
		xc = 4;
		d = 40;
		k = 0;
		H = 500; 

	}

	void update() {
		k += 0.01;
		x1 += xc;
		if (x1 + d >= getWidth() || x1 <= 0) {
			xc *= -1;
		}

	}

	void draw(Graphics g) {
		alpha = Math.PI * k;
		height = (int) (H * Math.sin(alpha));
		y1 = (int) (getHeight() - Math.abs(height));
		g.setColor(Color.RED);
		g.fillOval(x1, y1, d, d);

	}

	public Project02Problem04() {
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
		new Project02Problem04();
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
