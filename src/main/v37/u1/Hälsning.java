package main.v37.u1;

import java.util.Scanner;

import main.Uppgift;

public class Hälsning extends Uppgift
{
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Skriv in ditt namn: ");
		String in = scanner.nextLine();
		
		if(!in.isEmpty())
		{
			/* Stor bokstav! */
			in = Character.toUpperCase(in.charAt(0)) + in.substring(1).toLowerCase();
			
			/* Skriver ut texten! */
			System.out.println("Välkommen " + in + "!" + '\n' +
							   "Trevligt att träffa dig.");
		}
		
		/* Avslutar programmet! */
		scanner.close();
	}

	public static void main(String args[])
	{
		Hälsning k = new Hälsning();
		k.run();
	}
}
