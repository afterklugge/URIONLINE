import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project1Problem03 extends JFrame {
	String title = "Graphics Template";
	Color background = Color.BLACK;

	void draw(Graphics g) {

		// your code...
		int w = getWidth(); 
		int h = getHeight(); 

		int y = h / 15; 
		int red = 30; 
		int col = w / 18; 

		for (int x = 0; x < w; x++) { 
		Color c = new Color(red, 0, 0); 
		g.setColor(c); 
		g.drawLine(x, y, x, h - y); //x, 0, x, h 

		for (int i = 0; i < 40; i +=2) 
			if (x > col * i && x < col * (i + 1)) 
				red += 2; 
			else if (x > col * (i + 1) && x < col * (i + 2)) 
				red -= 2; 
			} 
		}

	public Project1Problem03() {
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
		new Project1Problem03();
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
