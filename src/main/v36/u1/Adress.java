package main.v36.u1;

import main.Uppgift;

public class Adress extends Uppgift
{
	public void run()
	{
		System.out.println("Johan Jansson" + '\n' + "Stenh�llsv�gen 18" + '\n' + "616 31  �BY");
	}
	
	public static void main(String args[])
	{
		Adress k = new Adress();
		k.run();
	}
}
