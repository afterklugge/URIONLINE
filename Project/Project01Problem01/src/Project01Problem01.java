import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project01Problem01 extends JFrame {
    String title = "Graphics Template";
    Color background = Color.BLACK;

    void draw(Graphics g) {
        // your code...
    	Random rand = new Random();
    	int h = getHeight();
    	int w = getWidth();
    	int maxR = Math.min(h, w) /2;
    	
    	 
    	for(int i = 1; i <= 500; i++) {
    		int r = rand.nextInt(maxR);
    		double alpha = 2 * Math.PI * rand.nextDouble();
    		int x = (int) (w / 2  + r * Math.cos(alpha));
    		int y = (int) (h / 2  + r * Math.sin(alpha));
    		Color c = new Color (rand.nextInt(255), 0, 0);
    		g.setColor(c);
    		g.drawLine(w/2, h/2, x, y);
    	}
    	
    	
    }

    public Project01Problem01() {
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
        new Project01Problem01();
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
