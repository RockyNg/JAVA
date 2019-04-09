package rocky;


public class temperature {
	
	readfile hey =new readfile();
	
	private int[] dest = ((hey.result).clone());
	private double hotHas;
	private double normalHas;
	private double coolHas;
	private double tong;
	private static double num1,num2,num3,num4,num5;
	
	
	
	public temperature()
	{
		hotHas=(double)dest[0]/dest[7];
		normalHas=(double)dest[1]/dest[7];
		coolHas=(double)dest[2]/dest[7];
		tong=(double)dest[7]/dest[9];
		
		
		num1=hotHas;
		num2=normalHas;
		num3=coolHas;
		
		System.out.println(hotHas);
		System.out.println(normalHas);
		System.out.println(coolHas);
		System.out.println(tong);
		
		
		
	

	}
	public double[] calc()
	{
		
		double ar[] = new double [3];
		
		ar[0]=num1;
		ar[1]=num2;
		ar[2]=num3;
	
		return ar;
		
	}
	double[] result=calc();

}
