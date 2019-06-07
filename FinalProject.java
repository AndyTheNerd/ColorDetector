//Andrew H
import javax.swing.JApplet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Robot; 
import java.awt.Color;
import java.awt.AWTException;
import javax.swing.*;

public class FinalProject2 extends JFrame
{
	public static void main (String [] args)
	{
		//JFrame f = new JFrame("RGB");
		//f.setLayout(new FlowLayout());
		JFrame f = new JFrame ("RGB");
		f.setSize(200,100);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		Color color, colr;
		//System.out.println(x + ":" + y);
		try
		{
				Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
				e.printStackTrace();
		}
		try
		{			
				Robot robot = new Robot();
				f.setVisible(true);
				JPanel panel = new JPanel ();
				
				//colr = new Color ( color.getRed() , color.getGreen() , color.getBlue());

				while (true)
				{
				PointerInfo a = MouseInfo.getPointerInfo();
				Point b = a.getLocation();

				int x = (int) b.getX();
				int y = (int) b.getY();
				color = robot.getPixelColor(x, y);
	
				//JLabel label = new JLabel("RGB is " + color.getRed() +" "+ color.getGreen() +" "+ color.getBlue());
		
				f.add(panel, BorderLayout.CENTER);
				//panel.add(label, BorderLayout.CENTER);
				panel.setBackground(color);
				String s = color.getRed() + ", " +color.getGreen() + ", " +color.getBlue();
   			System.out.println(s);		
		      }
		}
		catch (AWTException e) 
		{
			e.printStackTrace();
				
		}	
	  }	
	}
