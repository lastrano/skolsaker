package main.v36.u2;

import main.Uppgift;

public class Shakespear extends Uppgift
{
	public void run()
	{
		System.out.println(
				"\"Att vara eller inte vara,\n" +
				'\n' +
				"det är frågan.\"");
	}
	
	public static void main(String args[])
	{
		Shakespear k = new Shakespear();
		k.run();
	}
}
