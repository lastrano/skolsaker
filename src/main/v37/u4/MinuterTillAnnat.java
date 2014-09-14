package main.v37.u4;

import java.util.Scanner;

import main.Uppgift;

public class MinuterTillAnnat extends Uppgift
{
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Skriv in antal sekunder: ");
		int inSekunder = scanner.nextInt();
		
		int timmar = inSekunder / 3600;
		int minuter = (inSekunder % 3600) / 60;
		int sekunder = inSekunder % 60;
		
		System.out.print(inSekunder + " sekunder är ");
		if(timmar == 1)
			System.out.print(timmar + " timme, ");
		else
			System.out.print(timmar + " timmar, ");
		
		if(minuter == 1)
			System.out.print(minuter + " minut och ");
		else
			System.out.print(minuter + " minuter och ");
		
		if(sekunder == 1)
			System.out.print(minuter + " sekund!");
		else
			System.out.print(sekunder + " sekunder!");
		
		scanner.close();
	}
	
	public static void main(String args[])
	{
		MinuterTillAnnat k = new MinuterTillAnnat();
		k.run();
	}
}
