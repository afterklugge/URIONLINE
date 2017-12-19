import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project02Problem01 extends JFrame {
	String title = "Animation Template";
	Color background = Color.BLACK;
	int delay = 10;
	
	// Your variables...
	int x1, y1, x2, y2;
	int c1, c2;
	int red1, red2;
	int fg;
	void start() {
        // your code...
		int h = getHeight();
		int w = getWidth();
		x1 = w/10;
		fg = Math.min(h, w) / 2;
		x2 = w/10 + fg*2;
		y1 = h/4;
		y2 = h/4;
		red1 = 0;
		red2 = 255;
		c1 = 1;
		c2 = -1;
		
	}

	void update() {
        // your code...
		red1 += c1;
		red2 += c2;
		if (red1 == 255 || red2 == 0) {
			c1 *= -1;
			c2 *= -1;
		}
		
		
		
	}

	void draw(Graphics g) {
		Color q = new Color(red1, 0, 0);
		Color p = new Color(red2, 0, 0);
		g.setColor(p);
		g.fillRect(x1, y1, fg, fg);
		g.setColor(q);
		g.fillRect(x2, y2, fg, fg);
      
		
	}

	public Project02Problem01() {
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
		new Project02Problem01();
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
