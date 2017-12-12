import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Lab07Problem03 extends JFrame {
    String title = "Graphics Template";
    Color background = Color.BLUE;

    void draw(Graphics g) {
        // your code...
    	int w = getWidth();
    	int h = getHeight();
    	
    	drawStar(g, w / 2, h / 2, 200, Color.RED);
    	drawStar(g, w / 4, h / 4, 100, Color.YELLOW);
    	drawStar(g, w - w / 4, h / 4, 100, Color.YELLOW);
    	drawStar(g, w / 4, h - h / 4, 100, Color.YELLOW);
    	drawStar(g, w - w / 4, h - h / 4, 100, Color.YELLOW);
    }

    void drawStar(Graphics g, int x, int y, int r, Color c) {
    	int x1 = x + r;
    	int y1 = y;
    	
    	int x2 = x;
    	int y2 = y + r;
    	
    	int x3 = x - r;
    	int y3 = y;
    	
    	int x4 = x;
    	int y4 = y - r;
    	
    	int x5 = x + r / 4;
    	int y5 = y - r / 4;
    	
    	int x6 = x + r / 4;
    	int y6 = y + r / 4;
    	
    	int x7 = x - r / 4;
    	int y7 = y + r / 4;
    	
    	int x8 = x - r / 4;
    	int y8 = y - r / 4;
    	
    	g.setColor(c);
    	g.drawLine(x1, y1, x3, y3);
    	g.drawLine(x2, y2, x4, y4);
    	g.drawLine(x5, y5, x7, y7);
    	g.drawLine(x6, y6, x8, y8);
    	g.drawLine(x4, y4, x5, y5);
    	g.drawLine(x5, y5, x1, y1);
    	g.drawLine(x1, y1, x6, y6);
    	g.drawLine(x6, y6, x2, y2);
    	g.drawLine(x2, y2, x7, y7);
    	g.drawLine(x7, y7, x3, y3);
    	g.drawLine(x3, y3, x8, y8);
    	g.drawLine(x8, y8, x4, y4);
    	
	}

	public Lab07Problem03() {
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
        new Lab07Problem03();
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
