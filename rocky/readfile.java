package rocky;

import java.io.*;
import java.util.*;


public class readfile 
{
	private Scanner x,y;
	private int a1,a2,a3,b1,b2,c1,c2,d1,d2,train,l=0;
	private double s=0.70;
	public void openfile()
	{
		try 
		{
			x = new Scanner(new File("dataset.txt"));
			y = new Scanner(new File("dataset.txt"));
			
		}
		catch(Exception e)
		{
			System.out.println("could not find file");
		}
		
		
		while(y.hasNextLine())
		{
			String line =y.nextLine();
			l++;
			
		}
		
	}	
	
	public int getLineCounter()
	{
		return l;
	}
	
	
	public void readFile()
	{
		
		while(x.hasNext())
		{
			String a = x.next();
			String b = x.next();
			String c = x.next();
			String d = x.next();
			
			if ( a.equals("hot")||a.equals("Hot"))
			{
				a1++;
			}
			if ( a.equals("normal")||a.equals("Normal"))
			{
				a2++;
			}
			if ( a.equals("cool")||a.equals("Cool"))
			{
				a3++;
			}
			if ( b.equals("Yes")||b.equals("yes"))
			{
				b1++;
			}
			if ( b.equals("No")||b.equals("no"))
			{
				b2++;
			}
			if ( c.equals("Yes")||c.equals("yes"))
			{
				c1++;
			}
			if ( c.equals("No")||c.equals("no"))
			{
				c2++;
			}
			if ( d.equals("Yes")||d.equals("yes"))
			{
				d1++;
			}
			if ( d.equals("No")||d.equals("no"))
			{
				d2++;
			}
			
			train++;
			System.out.printf("%s %s %s %s\n", a,b,c,d);
			if(train>(l*s) )
			{
				break;
			}

		}

		System.out.println(a1+"\t hot\t\t\t"+a2+"\t normal\t\t\t\t"+a3+"\t cool");
		System.out.println(b1+"\t has aches\t\t"+b2+"\t doesn't have aches");
		System.out.println(c1+"\t has sore throat\t"+c2+"\t doesn't have sore throat");
		System.out.println(d1+"\t has tonsillitis\t"+d2+"\t doesn't have tonsillitis");
		System.out.println(l+"\t rows all together");
		System.out.println(Math.floor(l*s)+"\t training rows");

	}
	public void closeFile()
	{
		x.close();
	}
};

