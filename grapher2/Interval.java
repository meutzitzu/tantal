public class Interval
{
	protected double start;
	protected double end;
	protected boolean containsStart;
	protected boolean containsEnd;

	Interval( double start, double end)
	{
		this.start = start;
		this.end = end;
	}

	public void setBounds( double start, double end)
	{
		this.start = start;
		this.end = end;
	}
	
	public double getStart()
	{
		return start;
	}

	public double getEnd()
	{
		return end;
	}

	public SampledInterval sample(double delta)
	{
		return new SampledInterval(this, delta);
	}
}
