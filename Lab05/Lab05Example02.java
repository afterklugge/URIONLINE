import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab05Example02 extends JFrame {

	JPanel mainPanel = new JPanel();
	JPanel controlPanel = new JPanel();

	JButton redButton = new JButton("RED");
	JButton greenButton = new JButton("GREEN");
	JButton blueButton = new JButton("BLUE");

	Lab05Example02() {
		setLayout(new BorderLayout());

		mainPanel.setBackground(Color.RED);
		controlPanel.setBackground(Color.GRAY);

		add(mainPanel, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);

		controlPanel.add(redButton);
		controlPanel.add(greenButton);
		controlPanel.add(blueButton);

		redButton.addActionListener(new ButtonActionListener(Color.RED));
		blueButton.addActionListener(new ButtonActionListener(Color.BLUE));
		greenButton.addActionListener(new ButtonActionListener(Color.GREEN));

	}

	public static void main(String[] args) {
		Lab05Example02 frame = new Lab05Example02();
		frame.setTitle("Blablabla");
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	// inner class
	class ButtonActionListener implements ActionListener {
		Color color;

		public ButtonActionListener(Color color) {
			this.color = color;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			mainPanel.setBackground(color);
			
		}

	}
}
