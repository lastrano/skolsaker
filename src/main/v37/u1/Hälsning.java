package main.v37.u1;

import java.util.Scanner;

import main.Uppgift;

public class H�lsning extends Uppgift
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
			System.out.println("V�lkommen " + in + "!" + '\n' +
							   "Trevligt att tr�ffa dig.");
		}
		
		/* Avslutar programmet! */
		scanner.close();
	}

	public static void main(String args[])
	{
		H�lsning k = new H�lsning();
		k.run();
	}
}
