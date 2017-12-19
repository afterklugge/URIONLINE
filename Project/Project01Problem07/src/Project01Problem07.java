import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project01Problem07 extends JFrame {
    String title = "Graphics Template";
    Color background = Color.BLUE;

    void draw(Graphics g) {
        // your code...
    	// your code... 
    	int w = getWidth(); 
    	int h = getHeight() / 2; 

    	g.setColor(Color.red);  
    	double wave = 0; 
    	int H = 200;  
    	int x1 = 0; 
    	int y1 = h; 
    	int x2 = 1; 
    	int y2 = (int) (h - H * Math.sin(wave)); 
    	while (x1 <= w) { 
    		g.setColor(Color.red); 
    		g.drawLine(x1, y1, x2, y2); 
    		y1 = y2; 
    		x1 = x2; 
    		x2++; 
    		wave += 2 * Math.PI / (w / 6); 
    		y2 = (int) (h - H * Math.sin(wave)); 
    	} 
    	
       
    }
   	public Project01Problem07() {
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
        new Project01Problem07();
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
