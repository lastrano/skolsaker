package main.v36.u3;

import java.math.BigDecimal;

import main.Uppgift;
import main.v37.u2.Kvoten;

public class SekunderPer�r extends Uppgift
{
	public void run()
	{
		double dagarPer�r = 365;
		int timmarPerDag = 24;
		int minuterPerTimme = 60;
		int sekunderPerMinut = 60;
		
		double sekunderPer�r = dagarPer�r *
				timmarPerDag *
				minuterPerTimme *
				sekunderPerMinut;
		System.out.println("P� ett normalt �r g�r det " +
				new BigDecimal(sekunderPer�r) +
				" sekunder.");
		
		dagarPer�r = 365.256366;
		sekunderPer�r = dagarPer�r *
				timmarPerDag *
				minuterPerTimme *
				sekunderPerMinut;
		
		/* Baserat p� att ett �r �r den tid det tar f�r gjorden att rotera ett varv. */
		System.out.println("P� ett exakt �r g�r det " +
				new BigDecimal(sekunderPer�r) +
				" sekunder.");
	}
	
	public static void main(String args[])
	{
		SekunderPer�r k = new SekunderPer�r();
		k.run();
	}
}