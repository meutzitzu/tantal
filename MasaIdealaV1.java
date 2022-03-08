


import java.util.Scanner;

public class MasaIdealaV1 
{
	public static void main(String[] args)
	{
		//declaratii de variabile locale
		double masa, varsta, inaltimea;

		Scanner intrare;
		intrare = new Scanner(System.in);
		
		//mod text iEsire > afisarea pe ecran a textului Ce varsta ai:
		System.out.print("Ce varsta ai: ");
		//mod text Intrare > citirea unui numar real de la tastatura
		varsta = intrare.nextFloat();
		
		System.out.print("Ce inaltime ai: ");
		inaltimea = intrare.nextFloat();
		
		masa = 50 + 0.75 * (inaltimea - 150) + 0.25 * (varsta - 20);
		
		System.out.println("Masa ideala (barbat) = " + masa + " kg");
		System.out.println("Masa ideala (femeie) = " + 0.9 * masa + " kg");
	}
}
