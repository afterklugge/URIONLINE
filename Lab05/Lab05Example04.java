import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab05Example04 extends JFrame {

	CanvasPanel mainPanel = new CanvasPanel();

	Lab05Example04() {
		setLayout(new BorderLayout());

		add(mainPanel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		Lab05Example04 frame = new Lab05Example04();

		frame.setTitle("First GUI app");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	class CanvasPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			int w = getWidth() / 8;
			int h = getHeight() / 8;

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					Color c;
					if (i % 2 == 0)
						c = j % 2 == 0 ? Color.RED : Color.BLUE;
					else
						c = j % 2 != 0 ? Color.RED : Color.BLUE;

					g.setColor(c);
					g.fillRect(w * i, h * j, w, h);
				}
			}
		}

	}

}