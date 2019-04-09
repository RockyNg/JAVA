package rocky;

import java.io.*;
import java.util.*;


public class readfile 
{
	private Scanner x,y;
	private int a1,a2,a3,b1,b2,c1,c2,d1,d2,train,t2,l=0;
	private static int a11,a12,a13,b11,b12,c11,c12,d11,d12,t12;
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
	public int getT2()
	{
		t2=(int)(l*s);
		t12=t2;
		return t2;
	}
	
	
	public void readFile()
	{
		
		while(x.hasNext())
		{
			String a = x.next();
			String b = x.next();
			String c = x.next();
			String d = x.next();
			
			if ( (a.equals("hot")||a.equals("Hot"))&&(d.equals("Yes")||d.equals("yes")))
			{
				a1++;
			}
			if ( (a.equals("normal")||a.equals("Normal"))&&(d.equals("Yes")||d.equals("yes")))
			{
				a2++;
			}
			if (( a.equals("cool")||a.equals("Cool"))&&(d.equals("Yes")||d.equals("yes")))
			{
				a3++;
			}
			if (( b.equals("Yes")||b.equals("yes"))&&(d.equals("Yes")||d.equals("yes")))
			{
				b1++;
			}
			if ( (b.equals("No")||b.equals("no"))&&(d.equals("Yes")||d.equals("yes")))
			{
				b2++;
			}
			if ( ((c.equals("Yes")||c.equals("yes")))&&(d.equals("Yes")||d.equals("yes")))
			{
				c1++;
			}
			if ( (c.equals("No")||c.equals("no"))&&(d.equals("Yes")||d.equals("yes")))
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

		a11=a1;
		a12=a2;
		a13=a3;
		b11=b1;
		b12=b2;
		c11=c1;
		c12=c2;
		d11=d1;
		d12=d2;
		t12=d11+d12;
		
		
	}
	public int[] calc()
	{
		
		int ar[] = new int[10];
		
		ar[0]=a11;
		ar[1]=a12;
		ar[2]=a13;
		ar[3]=b11;
		ar[4]=b12;
		ar[5]=c11;
		ar[6]=c12;
		ar[7]=d11;
		ar[8]=d12;
		ar[9]=t12;
		
		return ar;
		
	}
	int[] result=calc();
	
	public void closeFile()
	{
		x.close();
	}
	
	
};