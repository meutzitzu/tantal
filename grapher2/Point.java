public class Point
{
	public double x;
	public double y;

	Point( double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public static double distance( Point p1, Point p2)
	{
		return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.x-p1.x)*(p2.y-p1.y));
	}

	public double distanceTo( Point p)
	{
		return distance(this, p);
	}

	public static Point add( Point p1, Point p2)
	{
		return new Point(p1.x+p2.x, p1.y+p2.y);
	}

	public static Point neg( Point p)
	{
		return new Point(-p.x, -p.y);
	}
	
	public static Point subtract( Point p1, Point p2)
	{
		return add( p1, neg(p2));
	}

}
