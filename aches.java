package rocky;
//aches calculations

public class aches 
{
	readfile hey =new readfile();
	
	private int[] dest = ((hey.result).clone());
	private double achesY;
	private double achesN;
	private static double num1,num2;
	
	public aches() 
	{
		achesY=(double)dest[3]/dest[7];
		achesN=(double)dest[4]/dest[7];
		num1=achesY;
		num2=achesN;
		
		
		
	
	
	}
	public double[] calc()
	{
		
		double ar[] = new double [2];
		
		ar[0]=num1;
		ar[1]=num2;
		
	
		return ar;
		
	}
	double[] result=calc();


}

