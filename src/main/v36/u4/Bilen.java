package main.v36.u4;

import main.Uppgift;

public class Bilen extends Uppgift
{
	public void run()
	{
		/* Orkade inte med fysiktänket... */
		
		double massa = 1200; // kg
		double deltaSpeed = (120 - 80) / 3.6; // m/s
		double acceleration = deltaSpeed / 7;
		double rörelsemängd = (massa * Math.sqrt(deltaSpeed)) / 2;
	}
	
	public static void main(String args[])
	{
		Bilen k = new Bilen();
		k.run();
	}
}
