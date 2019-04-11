package rocky;
//soreThroat calculations

public class soreThroat 
{
	readfile data3 =new readfile();
	
	private int[] OriginalData3 = ((data3.result1).clone());
	private double sThroatHasY,sThroatHasN,sThroatNHasY,sThroatNHasN;
	 
	private static double num1,num2,num3,num4;
	
	public soreThroat()
	{
		
		//naive bayes calculations
		sThroatHasY=(double)OriginalData3[10]/OriginalData3[14];
		sThroatHasN=(double)OriginalData3[11]/OriginalData3[14];
		sThroatNHasY=(double)OriginalData3[12]/OriginalData3[15];
		sThroatNHasN=(double)OriginalData3[13]/OriginalData3[15];
		
		num1=sThroatHasY;
		num2=sThroatHasN;
		num3=sThroatNHasY;
		num4=sThroatNHasN;
		
	
	}
	public double[] set4()
	{
		//putting calculated data into array
		double ar[] = new double [4];
		
		ar[0]=num1;
		ar[1]=num2;
		ar[2]=num3;
		ar[3]=num4;
		
	
		return ar;
		
	}
	double[] resultSThroat=set4();

}
