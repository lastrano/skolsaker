package main.v36.u3;

import java.math.BigDecimal;

import main.Uppgift;
import main.v37.u2.Kvoten;

public class SekunderPerÅr extends Uppgift
{
	public void run()
	{
		double dagarPerÅr = 365;
		int timmarPerDag = 24;
		int minuterPerTimme = 60;
		int sekunderPerMinut = 60;
		
		double sekunderPerÅr = dagarPerÅr *
				timmarPerDag *
				minuterPerTimme *
				sekunderPerMinut;
		System.out.println("På ett normalt år går det " +
				new BigDecimal(sekunderPerÅr) +
				" sekunder.");
		
		dagarPerÅr = 365.256366;
		sekunderPerÅr = dagarPerÅr *
				timmarPerDag *
				minuterPerTimme *
				sekunderPerMinut;
		
		/* Baserat på att ett år är den tid det tar för gjorden att rotera ett varv. */
		System.out.println("På ett exakt år går det " +
				new BigDecimal(sekunderPerÅr) +
				" sekunder.");
	}
	
	public static void main(String args[])
	{
		SekunderPerÅr k = new SekunderPerÅr();
		k.run();
	}
}