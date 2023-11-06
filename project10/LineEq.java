import java.util.Scanner;

public class LineEq
{

	public static void main(String[] args)
	{
		double m;
		double h;
		Scanner cin = new Scanner(System.in);
		System.out.printf("mx+h: ");
		System.out.printf("\nm = ");
		m = cin.nextFloat();
		System.out.printf("\nh = ");
		h = cin.nextFloat();
		System.out.printf(( m!=0 ? ("y = 0 <=> x = " + (-h/m))+"\n":"no solution!\n"));
	}
}
