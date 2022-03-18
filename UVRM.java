//package tantal
import java.util.Scanner;
import javax.swing.*;  


public class UVRM 
{
	static double x0, v0, a, x, v, t;
	

	//default constructor
	UVRM()
	{

	}

	public static double calcx(double x0, double  v0, double  a, double  t)
	{
		return x0 + v0*t + 0.5*a*t*t;
	}

	public static double calcv(double v0, double  a, double  t)
	{
		return v0 + a*t;
	}
	public static void parse()
	{
		Scanner cin;
		cin = new Scanner(System.in);
		
		System.out.print("x0 = ");
		x0 = cin.nextFloat();
		
		System.out.print("v0 = ");
		v0 = cin.nextFloat();
		
		System.out.print("a = ");
		a = cin.nextFloat();
	
		System.out.print("t = ");
		t = cin.nextFloat();
	}

	public static String rez( double x, double v)
	{

		return String.format("x = %.2f\nv = %.2f\n", x, v);
	}

	private static void main(String[] args)
	{
		parse();
		x = calcx(x0, v0, a, t);
		v = calcv(v0, a, t);
		System.out.printf(rez(x, v));

	}
}
