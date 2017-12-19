import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project01Problem08 extends JFrame {
    String title = "Graphics Template";
    Color background = Color.BLUE;

    void draw(Graphics g) {
    	// your code... 
    	int w = getWidth(); 
    	int h = getHeight(); 

    	g.setColor(Color.RED);
    	int centerx = w/2; 
    	int centery = h/2; 
    	double k = 0; 
    	double l = 1; 
    	int count=20; 
    	while(k < count*2){ 
    		double grade=Math.PI*k; 
    		int x2= (int)(w/2 + l*Math.cos(grade)); 
    		int y2= (int)(h/2 + l*Math.sin(grade)); 
    		k+=0.005; 
    		g.drawLine(centerx, centery, x2, y2); 
    		centerx = x2; 
    		centery = y2; 
    		l += 0.03; 
    	} 
       
    }
   	public Project01Problem08() {
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
        new Project01Problem08();
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
