package rocky;
//aches calculations

public class aches 
{
	//bring in data from readfile
	readfile data2 =new readfile();
	
	//cloning the original array 
	private int[] OriginalData2 = ((data2.result1).clone());
	private double achesHasY;
	private double achesHasN;
	private double achesNHasY;
	private double achesNHasN;
	private static double num1,num2,num3,num4;
	
	public aches() 
	{
		//naive bayes calculations
		achesHasY=(double)OriginalData2[6]/OriginalData2[14];
		achesHasN=(double)OriginalData2[7]/OriginalData2[14];
		achesNHasY=(double)OriginalData2[8]/OriginalData2[15];
		achesNHasN=(double)OriginalData2[9]/OriginalData2[15];
		
		num1=achesHasY;
		num2=achesHasN;
		num3=achesNHasY;
		num4=achesNHasN;

	}
	public double[] set3()
	{
		//putting calculated data into array
		double ar[] = new double [4];
		
		ar[0]=num1;
		ar[1]=num2;
		ar[2]=num3;
		ar[3]=num4;

		return ar;
		
	}
	double[] resultAches=set3();

}

