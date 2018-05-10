import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab05Example03 extends JFrame {

	JPanel mainPanel = new JPanel();

	Lab05Example03() {
		setLayout(new BorderLayout());

		add(mainPanel, BorderLayout.CENTER);

		mainPanel.setBackground(Color.BLUE);

		mainPanel.addMouseMotionListener(new PanelMouseMotionListener());
	}

	public static void main(String[] args) {
		Lab05Example03 frame = new Lab05Example03();

		frame.setTitle("First GUI app");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	class PanelMouseMotionListener extends MouseMotionAdapter {

		@Override
		public void mouseMoved(MouseEvent e) {
			setTitle(e.getX() + ", " + e.getY());
		}

	}
}