package main;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main
{
	public static void main(String args[])
	{
		new Main();
	}
	
	public Main()
	{
		Scanner scanner = new Scanner(System.in);
		String in = "";
		
		System.out.println("[ Tryck enter för senast körd uppgift! ]");
		System.out.print("[ vecka: ] ");
		
		in = scanner.nextLine();
		
		if(!in.isEmpty())
		{
			int week = Integer.parseInt(in);
			List<String> currentList = tasksFromWeek(week);
			
			System.out.println("[ Uppgifter som finns: ]");
			for(int i = 0; i < currentList.size(); i++)
			{
				String s = currentList.get(i);
				
				if(i != currentList.size() -1)
				{
					System.out.print(s.substring(1) + ", ");
				}
				else
				{
					System.out.println(s.substring(1));
				}
			}
			System.out.println("[ uppgift: ] ");
			
			int uppgift = scanner.nextInt();
			
			handleClass(week, uppgift);
		}
		else
		{
			try
			{
				BufferedReader reader = new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream("lastTask")));
				
				String line = null;
				if((line = reader.readLine()) != null)
				{
					handleClass(line);
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		scanner.close();
	}
	
	public boolean handleClass(int week, int uppgift)
	{
		return handleClass("main/v" + week + "/u" + uppgift);
	}
	
	public boolean handleClass(String packagez)
	{
		try
		{
			Class<?> rawClass = getClass(packagez);
			Uppgift u = (Uppgift) rawClass.newInstance();
			
			u.run();
			
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}
	
	public List<String> tasksFromWeek(int week)
	{
		try
		{
			String s = "main/v" + week;
			
			List<String> tasks = new ArrayList<String>();
			URL upackage = Main.class.getClassLoader().getResource(s);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) upackage.getContent()));
			String line = null;
			while((line = reader.readLine()) != null)
			{
				tasks.add(line);
			}
			
			return tasks;
		}
		catch(Exception ex)
		{
			return null;
		}
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static Class getClass(String pack)
	{
		try
		{
			String dottedPackage = pack.replaceAll("[/]", ".");
			List<Class> classes = new ArrayList<Class>();
			URL upackage = Main.class.getClassLoader().getResource(pack);
			
			DataInputStream dis = new DataInputStream((InputStream) upackage.getContent());
			String line = null;
			while ((line = dis.readLine()) != null)
			{
	            if(line.endsWith(".class"))
	            {
	            	classes.add(Class.forName(dottedPackage + "." + line.substring(0, line.lastIndexOf('.'))));
	            }
			}
			return classes.get(0);
		}
		catch(Exception ex)
		{
			return null;
		}
	}
}
