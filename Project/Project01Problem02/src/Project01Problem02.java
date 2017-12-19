import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project01Problem02 extends JFrame {
    String title = "Graphics Template";
    Color background = Color.BLACK;

    void draw(Graphics g) {
        // your code...
    	Random rand = new Random();
    	int h = getHeight();
    	int w = getWidth();
    	int maxR = Math.min(w, h) / 10;
    	
    	for (int j =1; j <= 35; j++) {
    		int q = rand.nextInt(w);
    		int p = rand.nextInt(h);
    		int x1 = rand.nextInt(3);
    	for(int i = 1; i <= 500; i++) {
    		Color c = new Color (rand.nextInt(255), 0, 0);
    		Color c1 = new Color (0, rand.nextInt(255), 0);
    		Color c2 = new Color (0, 0, rand.nextInt(255));
    		Color[] arr = {c, c1, c2};
    		
    		int r = rand.nextInt(maxR);
    		double alpha = 2 * Math.PI * rand.nextDouble();
    		int x = (int) (q + r * Math.cos(alpha));
    		int y = (int) (p  + r * Math.sin(alpha));
    		
    		g.setColor(arr[x1]);
    		g.drawLine(q, p, x, y);
    	}
   	}
    	
    	
    }

    public Project01Problem02() {
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
        new Project01Problem02();
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
