import java.util.Scanner;

public class BasicStat
{

	public static void main(String[] args)
	{
		Scanner cin;
		cin = new Scanner(System.in);
		
		/// READ NUM OF ELEMENTS ///
		System.out.printf("n=");
		int n = cin.nextInt();
		double[] x = new double[n];
		
		/// READ ELEMENTS ///
		for(int i=0; i<n; ++i)
		{
			System.out.printf("x[%d]=", i);
			x[i] = cin.nextDouble();
		}
		
		/// FIND MAXIMUM ///
		double max = x[0];
		double mean = 0.0;
		double min = x[0];
		for(int i=0; i<n; ++i)
		{
			max = ( x[i] > max ? x[i] : max);
			min = ( x[i] < min ? x[i] : min);
			mean += x[i];
		}
		mean /= x.length;
		/// PRINT ELEMENTS ///
		double variance=0.0;
		for(int i=0; i<n; ++i)
		{
			variance += (x[i]-mean)*(x[i]-mean);
		}
		for(int i=0; i<n; ++i)
		{
			System.out.printf("x[%d]=%8.2f", i, x[i]);
		}

		System.out.printf("\nMAX ELEMENT IS %8.2f\nMIN ELEMENT IS %8.2f\nMEAN VALUE IS %8.2f\nVARIACNCE IS %8.2f\n", max, min, mean, variance);
	}	
}
