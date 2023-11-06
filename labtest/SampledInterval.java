public class SampledInterval 
{
	double[] samples;
	double start;
	double end;
	SampledInterval( double start, double end, double delta)
	{
		this.start = start;
		this.end = end;
		samples = new double[(int)( (end-start)/delta) +1];
		sample(delta);
	}

	public void sample( double delta)
	{
		int i = 0;
		double x = start;
		while( x<=end)
		{
			samples[i++] = x;
			x += delta;
		}
		samples[i] = end;
	}
}
