import java.lang.*;

public class Graph
{
	int width;
	int height;
	double epsilon;
	Point2 offset;
	double scale;
	double squish;
	
	TermWindow window;
	
	public Document doc;
	
	Graph(TermWindow w)
	{
		window=w;
		width=window.width;
		height=window.height;
		offset = new Point2((double)width/2, (double)height/2);
		scale=1.0;
		squish=2.0;
		epsilon=-0.05;
		doc = new Document();
	}
	
	public void drawAxis()
	{
		if(0<=offset.y&&offset.y<height)
		{
			for(int cx=0; cx<width; cx++)
			{
				window.setChar(cx,(int)offset.y,'-');
			}
		}
		if(0<=offset.x&&offset.x<width)
		{
			for(int cy=0; cy<height; cy++)
			{
				window.setChar((int)offset.x,cy,'|');
			}
		}
	}
	
	public Point2 sctomc(int x, int y)
	{
		return new Point2(scale*(x-offset.x)/squish,scale*(y-offset.y));
	}
	
	public void drawExpr()
	{
		for (int y=0; y<height; y++)
		{
			for(int x=0; x<width; x++)
			{
				if ( 
					doc.exprs.get(0).eval(sctomc(x,y).x,sctomc(x,y).y) < epsilon
				)
					window.setChar(x,y,':');
			}
		}
	}
	
	public void drawGrid()
	{
		
	}
	
	public void setEpsilon(double e)
	{
		epsilon=e;
	}
	
	public void setOrigin(double x, double y)
	{
		offset.x = x;
		offset.y = y;
	}
	
	public void translate(double delta_x, double delta_y)
	{
		offset.x += delta_x;
		offset.y += delta_y;
	}
	
	public void setScale(double s)
	{
		scale = s;
	}
	
	public void scale(double kappa)
	{
		scale *= kappa;
	}
	
	public void render()
	{
		drawExpr();
		drawAxis();
		window.render();
	}
	
	public void wipe()
	{
		window.wipe();
	}
	
	public void ctrl(char c)
	{
		double delta = 1.0;
		double kappa = 1.05;
		int repeater = 1;
		
		delta *= repeater;
		kappa = Math.pow(kappa, repeater);
		
		switch(c)
		{
			case 'h':
			{
				translate(delta, 0);
				break;
			}
			case 'j':
			{
				translate(0, -delta);
				break;
			}
			case 'k':
			{
				translate(0, delta);
				break;
			}
			case 'l':
			{
				translate(-delta, 0);
				break;
			}
			case '-':
			{
				scale(kappa);
				break;
			}
			case '+':
			{
				scale(1./kappa);
				break;
			}
			case '=':
			{
				setScale(1.0);
				break;
			}
			case 'q':
			{
				break;
			}
		}
		wipe();
	}
}
