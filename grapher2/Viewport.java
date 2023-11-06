import javax.swing.*;
import java.awt.*;  

public class Viewport extends JFrame
{
	double height;
	double width;
	double scale;
	double delta;
//	Point offset;
//	Interval view;
	SampledInterval xv;

	Viewport()
	{
	//	view = new Interval(0.0, 10.0);
		delta = 0.1;
		scale = 10.0;
	//	offset = new Point(50, 50);
		xv = new SampledInterval(0.0, 20.0, delta);
	}
	public void paint(Graphics g) 
	{
///*
	Graphics2D g2 = (Graphics2D)g;

		for ( int i = 0; i<xv.samples.length-1; i++)
		{
		//	g.drawLine(50 + (int)(i*scale*delta), 100+(int)(scale*Function1.eval(xv.samples[i])), 50+(int)((i+1)*delta*scale), 100+(int)(Function1.eval(xv.samples[i+1])));
			g.drawLine(50 + (int)(i*scale*delta), 400-(int)(scale*Function1.eval(xv.samples[i])), 50 + (int)((i+1)*scale*delta), 400-(int)(scale*Function1.eval(xv.samples[i+1])));
		}
//*/
	}

}
