public class ChebyshevLambda implements Expression
{
	public double time;
	
	public double eval()
	{
		return (x*x + y*y) - 5.0*Math.sin(time);
	}
}
