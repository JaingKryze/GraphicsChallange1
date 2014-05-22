import java.awt.*;
import javax.swing.*;

public class MyCanvas extends Canvas
	{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
		{
		MyCanvas canvas = new MyCanvas();
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setResizable(false);
		frame.setVisible(true);
		}

	public void paint(Graphics graphics)
		{
		// graphics.setColor(Color.black);
		// graphics.drawLine(40, 30, 330, 380); //This is the line you'll change
		// graphics.drawLine(40, 380, 330, 30);
		// graphics.drawRect(10, 10, 810, 100);
		// graphics.setColor(Color.red);
		// graphics.drawRect(1, 1, 250, 480);
		// graphics.setColor(Color.yellow);
		// graphics.fillRect(750, 750, 100, 100);
		// graphics.setColor(Color.blue);
		// graphics.drawRect(750, 750, 100, 100);
		graphics.setColor(Color.yellow);
		graphics.fillOval(100, 100, 100, 100);
		graphics.setColor(Color.black);
		graphics.fillRect(120, 120, 10, 10);
		graphics.fillRect(170, 120, 10, 10);
		graphics.fillOval(140, 140, 20, 20);
		}
	}