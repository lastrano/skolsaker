package main.v37.u3;

import java.util.Scanner;

import main.Uppgift;

public class MinuterPerDagar extends Uppgift
{
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Skriv in antal hela dagar: ");
		int dagar = scanner.nextInt();
		
		int minuterPerDag = 60 * 24;
		
		System.out.println("På " + dagar + " dagar går det " + (dagar * minuterPerDag) + " minuter!");
		
		scanner.close();
	}
	
	public static void main(String args[])
	{
		MinuterPerDagar k = new MinuterPerDagar();
		k.run();
	}
}
