import javax.swing.*;
import java.awt.*;  

public class Logo extends JPanel
{
	int size;
	int radius;

	Logo( int size, int radius)
	{
		this.size = size;
		this.radius = radius;
	}

	public void paint(Graphics g) 
	{
		g.drawLine(10,10, size-20, size-20);
		g.drawRect(10,10, size-20, size-20);
		g.fillOval(size/2-radius, size/2-radius, 2*radius, 2*radius);
	}

}
