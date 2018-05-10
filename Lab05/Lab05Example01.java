import java.awt.*;
import javax.swing.*;

public class Lab05Example01 extends JFrame {
	
	JPanel mainPanel = new JPanel();
	JPanel controlPanel = new JPanel();
	
	JButton redButton = new JButton("RED");
	JButton greenButton = new JButton("GREEN");
	JButton blueButton = new JButton("BLUE");
	
	Lab05Example01() {
		setLayout(new BorderLayout());
		
		add(mainPanel, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		
		mainPanel.setBackground(Color.RED);
		controlPanel.setBackground(Color.GRAY);
		
		controlPanel.add(redButton);
		controlPanel.add(greenButton);
		controlPanel.add(blueButton);
	}
	
	public static void main(String[] args) {
		Lab05Example01 frame = new Lab05Example01();
		
		frame.setTitle("First GUI app");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}