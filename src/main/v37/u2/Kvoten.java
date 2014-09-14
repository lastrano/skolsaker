package main.v37.u2;

import java.util.Locale;
import java.util.Scanner;

import main.Uppgift;

public class Kvoten extends Uppgift
{
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.forLanguageTag("SE"));
		
		System.out.print("Skriv in ett tal f�r t�ljaren (Komma(,)): ");
		double t�ljaren = scanner.nextDouble();
		
		System.out.print("Skriv in ett tal f�r n�mnaren (Komma(,)): ");
		double n�mnaren = scanner.nextDouble();
		double kvoten = t�ljaren / n�mnaren;
		
		if(t�ljaren == (int) t�ljaren)
			System.out.println("T�ljare: " + (int) t�ljaren);
		else
			System.out.println("T�ljare: " + t�ljaren);
		
		if(n�mnaren == (int) n�mnaren)
			System.out.println("N�mnare: " + (int) n�mnaren);
		else
			System.out.println("N�mnare: " + n�mnaren);
		
		if(kvoten == (int) kvoten)
			System.out.println("Kvoten:  " + (int) kvoten);
		else
			System.out.println("Kvoten:  " + kvoten);
		scanner.close();
	}
	
	public double toDecimal(double d)
	{
		return 0;
	}
	
	public static void main(String args[])
	{
		Kvoten k = new Kvoten();
		k.run();
	}
}
