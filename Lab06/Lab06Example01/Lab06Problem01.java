package Lab06Example01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;

public class Lab06Problem01 extends JFrame {
	Random rnd = new Random();
	ArrayList<Figure> figures = new ArrayList<>();
	CanvasPanel panel = new CanvasPanel();

	Lab06Problem01() {
		panel.setBackground(Color.BLACK);
		panel.setFocusable(true);

		add(panel);

		panel.addKeyListener(new PanelKeyListener());
		panel.addMouseListener(new PanelMouseListener());

	}

	public static void main(String[] args) {
		Lab06Problem01 frame = new Lab06Problem01();
		frame.setTitle("Simplest Graphical Editor");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	class PanelKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_1) {
				int x = rnd.nextInt(panel.getWidth());
				int y = rnd.nextInt(panel.getHeight());
				int w = 25 + rnd.nextInt(50);
				int h = 25 + rnd.nextInt(50);
				figures.add(new Rect(x, y, w, h));
				repaint();
			} else if (e.getKeyCode() == KeyEvent.VK_2) {
				int x = rnd.nextInt(panel.getWidth());
				int y = rnd.nextInt(panel.getHeight());
				int r = 25 + rnd.nextInt(50);
				figures.add(new Circle(x, y, r));
				repaint();
			}

		}

	}

	class PanelMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			for (Figure f : figures) {
				if (f.contains(e.getX(), e.getY())) {
					JOptionPane.showMessageDialog(null, f.toString());
					break;
				}
			}
		}

	}

	class CanvasPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			for (Figure f : figures) {
				f.draw(g);
			}
		}

	}

}