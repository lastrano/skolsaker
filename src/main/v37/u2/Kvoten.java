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
		
		System.out.print("Skriv in ett tal för täljaren (Komma(,)): ");
		double täljaren = scanner.nextDouble();
		
		System.out.print("Skriv in ett tal för nämnaren (Komma(,)): ");
		double nämnaren = scanner.nextDouble();
		double kvoten = täljaren / nämnaren;
		
		if(täljaren == (int) täljaren)
			System.out.println("Täljare: " + (int) täljaren);
		else
			System.out.println("Täljare: " + täljaren);
		
		if(nämnaren == (int) nämnaren)
			System.out.println("Nämnare: " + (int) nämnaren);
		else
			System.out.println("Nämnare: " + nämnaren);
		
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
