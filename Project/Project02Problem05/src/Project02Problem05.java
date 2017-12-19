import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Project02Problem05 extends JFrame {
	String title = "Animation Template";
	Color background = Color.BLACK;
	int delay = 10;
	int w, h;
	int x, y;
	int xc, yc;
	int xh, yh;
	double alpha, beta;
	int r;
	int schet;
	int x1, y1;
	int sec, min;
	int x2, y2;
	double ugol;
	void start() {
		w = getWidth();
		h = getHeight();
		sec = 1;
		min = 0;
		xc = w / 2;
		yc = h / 2;
		alpha = Math.PI * 3 / 2;
		beta = Math.PI * 10 / 6;
		r = h / 2;
		x1 = xc;
		//y1 = yc - r;
		x2 = xc;
		y1 = r / 6;
		ugol = 0;
	}
	void update() {
		sec++;
		if(sec == 60) {
			sec = 0;
			min++;
			if(min == 60) {
				min = 0;
			}
		}
//		if (schet > 0 && schet % 360 == 0) {
//			beta += (Math.PI / 30);
//		}
//		schet++;
	}
	void draw(Graphics g) {
		
		if(sec > 0) {
			alpha += (Math.PI / 180);
		} 
		x = (int) (xc + r * Math.cos(alpha));
		y = (int) (yc + r * Math.sin(alpha));
		xh = (int) (xc + r / 2 * Math.cos(beta));
		yh = (int) (yc + r / 2 * Math.sin(beta));
		g.setColor(Color.white);
		g.drawLine(xc, yc, x, y);
		g.drawLine(xc, yc, xh, yh);
		for (int i = 0; i <= 60; i++) {
			g.drawLine(x2, y2, x1, y1);
			x1 = (int) (xc + r * Math.cos(ugol));
			y1 = (int) (yc + r * Math.sin(ugol));
			x2 = (int) (xc + r / 6 * 5 * Math.cos(ugol));
			y2 = (int) (yc + r / 6 * 5 * Math.sin(ugol));
			ugol += Math.PI / 30;
		}
	}
	public Project02Problem05() {
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
		new Project02Problem05();
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
			// try {
			draw(g);
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}
}