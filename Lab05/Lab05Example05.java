import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab05Example05 extends JFrame {

	CanvasPanel mainPanel = new CanvasPanel();
	Player player = new Player(0, 0);

	Lab05Example05() {
		setLayout(new BorderLayout());

		add(mainPanel, BorderLayout.CENTER);

		mainPanel.setFocusable(true);
		mainPanel.addKeyListener(new PanelKeyListener());
		
	}

	public static void main(String[] args) {
		Lab05Example05 frame = new Lab05Example05();

		frame.setTitle("First GUI app");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	class PanelKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				player.moveUp();
				break;
			case KeyEvent.VK_DOWN:
				player.moveDown();
				break;
			case KeyEvent.VK_LEFT:
				player.moveLeft();
				break;
			case KeyEvent.VK_RIGHT:
				player.moveRight();
				break;

			}
			mainPanel.repaint();
		}

	}

	class CanvasPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			int w = getWidth() / 8;
			int h = getHeight() / 8;

			for (int i = 0; i < 8; ++i) {
				for (int j = 0; j < 8; ++j) {
					Color c = null;
					if (i % 2 == 0) {
						c = j % 2 == 0 ? Color.RED : Color.BLUE;
					} else {
						c = j % 2 != 0 ? Color.RED : Color.BLUE;
					}
					g.setColor(c);
					g.fillRect(w * i, h * j, w, h);
				}
			}

			g.setColor(Color.YELLOW);
			g.fillRect(w / 4 + w * player.getCol(), h / 4 + h * player.getRow(), w / 2, h / 2);
		}

	}
}