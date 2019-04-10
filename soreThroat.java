package rocky;
//soreThroat calculations

public class soreThroat {
readfile hey =new readfile();
	
	private int[] dest = ((hey.result).clone());
	private double sThroatY;
	private double sThroatN;
	private static double num1,num2;
	
	public soreThroat(){
		
	
		sThroatY=(double)dest[5]/dest[7];
		sThroatN=(double)dest[6]/dest[7];
		num1=sThroatY;
		num2=sThroatN;
		
	
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
