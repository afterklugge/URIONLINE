import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project01Problem09 extends JFrame {
    String title = "Graphics Template";
    Color background = Color.BLACK;

    void draw(Graphics g) {
    	// your code... 
    	Random rnd = new Random(); 
    	int w = getWidth(); 
    	int h = getHeight(); 
    	int numCol = 10; 
    	int widthCol = (w - 200) / numCol; 
    	int x = 100; 
    	int y; 
    	g.setColor(Color.white);
    	g.drawLine(x, h / 12, x, h - 100); 
    	g.drawLine(x, h - 100, x + widthCol * numCol + 40, h - 100); 

    	for (int i = 0; i < numCol; i++) { 
    		y = rnd.nextInt(h - h / 6); 
    		g.setColor(Color.RED); 
    		g.fillRect(x, y, widthCol,h-y-100); 
    		g.setColor(Color.YELLOW); 
    		g.drawRect(x, y, widthCol, h - y - 100); 
    		x += widthCol; 
    	} 
       
    }
   	public Project01Problem09() {
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
        new Project01Problem09();
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
