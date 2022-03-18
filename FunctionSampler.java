import java.util.Scanner;


public class FunctionSampler
{


	FunctionSampler()
	{

	}

	public static double f(double x)
	{
		return Math.sin(x);
	}

	public class SampledInterval
	{
		double[] samples = null;



		SampledInterval(Interval interval, double increment)
		{
			samples = new double[(int)((interval.end-interval.start)/increment)+2];
			double x = interval.start;
			int i = 0;
			while(x<=interval.end)
			{
				samples[i++] = x;
				x += increment;
			}
			samples[i]=interval.end;
		}
	}

	public SampledInterval sample(Input in)
	{
		return new SampledInterval(in.interval, in.increment);
	}

	public class Interval
	{
		double end, start;
		
		Interval(double Istart, double Iend)
		{
			start = Istart;
			end = Iend;
		}

	}

	public class Input
	{
		Interval interval = null;
		
		double increment;

		Input( double Istart, double Iend, double Iincrement)
		{
			interval = new Interval(Istart, Iend);
			increment = Iincrement;
		}

	}

	public Input getInputs()
	{
		Scanner cin;
		cin = new Scanner(System.in);
		
		double w0, w1, dx;

		System.out.printf("\nstart = ");
		w0 = cin.nextFloat();

		System.out.printf("\nend = ");
		w1 = cin.nextFloat();

		System.out.printf("\ndx = ");
		dx = cin.nextFloat();

		Input input = new Input( w0, w1, dx);

		return input;
	}

	public double[] calcFunction( SampledInterval in)
	{
		double[] values = in.samples.clone();
		for ( int i = 0; i<values.length; i++)
		{
		//values[i] = f(values[i]);
		values[i] = f(values[i]);
		}

		return values;
	}

	public static void printresults(double[] data)
	{
		System.out.println("f(x):\n");
		for (double x : data)
			System.out.printf("y = %.2f\n", x);
	}

	public static void runfromCLI()
	{
		FunctionSampler sampler = new FunctionSampler();
		
		sampler.printresults(sampler.calcFunction(sampler.sample(sampler.getInputs())));
	}

	public static void main(String[] args)
	{
		runfromCLI();
	}
}
