package rocky;

public class temperature {
	
	//bring in data from readfile
	readfile data1 =new readfile();

	//cloning the original array 
	private int[] originalData = ((data1.result1).clone());
	private double hotHas ,normalHas,coolHas,tong,hotNHas ,normalNHas,coolNHas,Ntong;
	private static double num1,num2,num3,num4,num5,num6,num7,num8;
	
	
	
	public temperature()
	{
		//naive bayes calculations
		hotHas=(double)originalData[0]/originalData[14];
		normalHas=(double)originalData[1]/originalData[14];
		coolHas=(double)originalData[2]/originalData[14];
		tong=(double)originalData[14]/originalData[16];
		
		hotNHas=(double)originalData[3]/originalData[15];
		normalNHas=(double)originalData[4]/originalData[15];
		coolNHas=(double)originalData[5]/originalData[15];
		Ntong=(double)originalData[15]/originalData[16];
		
		//putting data into static variables to transfer into nbayes class
		num1=hotHas;
		num2=normalHas;
		num3=coolHas;
		num4=tong;
		
		num5=hotNHas;
		num6=normalNHas;
		num7=coolNHas;
		num8=Ntong;

	}
	
	public double[] set2()
	{
		//putting calculated data into array
		double arraytemp[] = new double [8];
		
		arraytemp[0]=num1;
		arraytemp[1]=num2;
		arraytemp[2]=num3;
		arraytemp[3]=num4;
		arraytemp[4]=num5;
		arraytemp[5]=num6;
		arraytemp[6]=num7;
		arraytemp[7]=num8;
	
		
		return arraytemp;
		
	}
	double[] resultTemp=set2();

}
