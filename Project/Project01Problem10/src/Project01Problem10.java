import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Project01Problem10 extends JFrame {
    String title = "Graphics Template";
    Color background = Color.BLUE;

    void draw(Graphics g) {
    	// your code... 
    	int w = getWidth(); 
    	int h = getHeight(); 

    	int x1=w/4; 
    	int y1=h/12; 

    	int x2=w-w/4; 
    	int y2=h/12; 

    	int x3=w-w/4; 
    	int y3=h-h/12; 

    	int x4=w/4; 
    	int y4=h-h/12; 
    	g.setColor(Color.red); 
    	g.drawLine(x1, y1, x2, y2); 
    	g.drawLine(x2,y2,x3,y3); 
    	g.drawLine(x3, y3, x4, y4); 
    	g.drawLine(x4, y4, x1, y1); 
    	g.drawRect(w/4,h/12,w/2,h-h/12-h/12); 
    	for(int i =0;i<20;i++){ 
    	int x11=((5*x1)+(1*x2))/6; 
    	int y11=((5*y1)+(1*y2))/6; 
    	int x22=((5*x2)+(1*x3))/6; 
    	int y22=((5*y2)+(1*y3))/6; 
    	int x33=((5*x3)+(1*x4))/6; 
    	int y33=((5*y3)+(1*y4))/6; 
    	int x44=((5*x4)+(1*x1))/6; 
    	int y44=((5*y4)+(1*y1))/6; 
    	g.drawLine(x11,y11,x22,y22); 
    	g.drawLine(x22, y22, x33, y33); 
    	g.drawLine(x33, y33, x44, y44); 
    	g.drawLine(x11,y11,x44,y44); 
    	x1=x11; 
    	x2=x22; 
    	x3=x33; 
    	x4=x44; 
    	y1=y11; 
    	y2=y22; 
    	y3=y33; 
    	y4=y44; 

    	} 


    }

    public Project01Problem10() {
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
        new Project01Problem10();
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
