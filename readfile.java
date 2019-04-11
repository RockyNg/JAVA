package rocky;

import java.io.*;
import java.util.*;


public class readfile 
{
	private Scanner x,y;
	private int HotYesTon,NormalYesTon,CoolYesTon,AchesYesTon,NoAchesYesTon,YesSThroatYesTon,NoSThroatYesTon,HotNoTon,NormalNoTon=0;
	private int CoolNoTon,AchesNoTon,NoAchesNoTon,YesSThroatNoTon,NoSThroatNoTon,HaveTon,HaveNoTon,train,t2,rows=0;
	private static int a11,a12,a13,b11,b12,c11,c12,a14,a15,a16,b13,b14,c13,c14,d11,d12,t12;
	private double practise=0.70;
	
	//find the file
	public void openfile()
	{
		try 
		{
			//read in data set x for every data, y for row counting
			x = new Scanner(new File("dataset.txt"));
			y = new Scanner(new File("dataset.txt"));
			
		}
		catch(Exception e)
		{
			System.out.println("could not find file");
		}
		
		//count the rows in data set
		while(y.hasNextLine())
		{
			String line =y.nextLine();
			rows++;
			
		}
		
	}	
	//return rows 
	public int getLineCounter()
	{
		return rows;
	}
	//return 70% of rows to practise on
	public int getT2()
	{
		t2=(int)(rows*practise+1);
		t12=t2;
		return t2;
	}
	
	
	public void readFile()
	{
		//read content
		while(x.hasNext())
		{
			//every 4 data is read in as Temperature, Aches, Sore Throat and Tonsillitis
			String a = x.next();
			String b = x.next();
			String c = x.next();
			String d = x.next();
			
			//if first element is hot and 4th element is yes then HotYesTon plus 1 
			if ( (a.equals("hot")||a.equals("Hot"))&&(d.equals("Yes")||d.equals("yes")))
			{
				HotYesTon++;
			}
			if ( (a.equals("normal")||a.equals("Normal"))&&(d.equals("Yes")||d.equals("yes")))
			{
				NormalYesTon++;
			}
			if (( a.equals("cool")||a.equals("Cool"))&&(d.equals("Yes")||d.equals("yes")))
			{
				CoolYesTon++;
			}
			
			//if first element is hot and 4th element is no then HotNoTon plus 1 
			if ( (a.equals("hot")||a.equals("Hot"))&&(d.equals("No")||d.equals("no")))
			{
				HotNoTon++;
			}
			if ( (a.equals("normal")||a.equals("Normal"))&&(d.equals("No")||d.equals("no")))
			{
				NormalNoTon++;
			}
			if (( a.equals("cool")||a.equals("Cool"))&&(d.equals("No")||d.equals("no")))
			{
				CoolNoTon++;
			}
			
			//Aches
			if (( b.equals("Yes")||b.equals("yes"))&&(d.equals("Yes")||d.equals("yes")))
			{
				AchesYesTon++;
			}
			if ( (b.equals("No")||b.equals("no"))&&(d.equals("Yes")||d.equals("yes")))
			{
				NoAchesYesTon++;
			}
			if (( b.equals("Yes")||b.equals("yes"))&&(d.equals("No")||d.equals("no")))
			{
				AchesNoTon++;
			}
			if ( (b.equals("No")||b.equals("no"))&&(d.equals("No")||d.equals("no")))
			{
				NoAchesNoTon++;
			}
			
			//Sore Throat
			if ( ((c.equals("Yes")||c.equals("yes")))&&(d.equals("Yes")||d.equals("yes")))
			{
				YesSThroatYesTon++;
			}
			if ( (c.equals("No")||c.equals("no"))&&(d.equals("Yes")||d.equals("yes")))
			{
				NoSThroatYesTon++;
			}
			if ( ((c.equals("Yes")||c.equals("yes")))&&(d.equals("No")||d.equals("no")))
			{
				YesSThroatNoTon++;
			}
			if ( (c.equals("No")||c.equals("no"))&&(d.equals("No")||d.equals("no")))
			{
				NoSThroatNoTon++;
			}
			
			//Tonsillitis calc
			if ( d.equals("Yes")||d.equals("yes"))
			{
				HaveTon++;
			}
			if ( d.equals("No")||d.equals("no"))
			{
				HaveNoTon++;
			}
			
			//training rows counter
			train++;
			
			//prints out data set 
			System.out.printf("%s %s %s %s\n", a,b,c,d);
			
			//if training counter exceeds training rows then exit loop
			if(train>(rows*practise+1) )
			{
				break;
			}

		}//end while loop
		
		//prints out data acquired
		System.out.println("\nThese people have tong:\n");

		System.out.println(HotYesTon+"\t hot\t\t\t"+NormalYesTon+"\t normal\t\t\t\t"+CoolYesTon+"\t cool");
		System.out.println(AchesYesTon+"\t has aches\t\t"+NoAchesYesTon+"\t doesn't have aches");
		System.out.println(YesSThroatYesTon+"\t has sore throat\t"+NoSThroatYesTon+"\t doesn't have sore throat");
		System.out.println("\nThese people do not have tong:\n");

		System.out.println(HotNoTon+"\t hot\t\t\t"+NormalNoTon+"\t normal\t\t\t\t"+CoolNoTon+"\t cool");
		System.out.println(AchesNoTon+"\t has aches\t\t"+NoAchesNoTon+"\t doesn't have aches");
		System.out.println(YesSThroatNoTon+"\t has sore throat\t"+NoSThroatNoTon+"\t doesn't have sore throat\n");
		System.out.println(HaveTon+"\t has tonsillitis\t"+HaveNoTon+"\t doesn't have tonsillitis\n");

		System.out.println(rows-1+"\t rows all together");
		System.out.println(Math.floor(rows*practise+1)+"\t training rows");

		//puts data into static variable 
		a11=HotYesTon;
		a12=NormalYesTon;
		a13=CoolYesTon;
		a14=HotNoTon;
		a15=NormalNoTon;
		a16=CoolNoTon;
		b11=AchesYesTon;
		b12=NoAchesYesTon;
		b13=AchesNoTon;
		b14=NoAchesNoTon;
		c11=YesSThroatYesTon;
		c12=NoSThroatYesTon;
		c13=YesSThroatNoTon;
		c14=NoSThroatNoTon;
		d11=HaveTon;
		d12=HaveNoTon;
		t12=d11+d12;
		
		
	}//end readfile method
	
	//put data into array 
	public int[] set1()
	{
		
		int array1[] = new int[17];
		
		array1[0]=a11;
		array1[1]=a12;
		array1[2]=a13;
		array1[3]=a14;
		array1[4]=a15;
		array1[5]=a16;
		array1[6]=b11;
		array1[7]=b12;
		array1[8]=b13;
		array1[9]=b14;
		array1[10]=c11;
		array1[11]=c12;
		array1[12]=c13;
		array1[13]=c14;
		array1[14]=d11;
		array1[15]=d12;
		array1[16]=t12;
		
		return array1;
		
	}//end array method
	
	int[] result1=set1();
	
	public void closeFile()
	{
		x.close();
	}
	
};