package rocky;

public class nbayes 
{
	temperature hey =new temperature();
	aches hey2 =new aches();
	soreThroat hey3 =new soreThroat();
	
	private double[] dest = ((hey.result).clone());
	private double[] dest2 = ((hey2.result).clone());
	private double[] dest3 = ((hey3.result).clone());
	
	private double m1,m2,m3,m4,m5,m6,m7,m8;
 
	private static double n1,n2,n3,n4,n5,n6,n7,n8;
	public nbayes() 
	{
		m1=(double)dest[0];
		m2=(double)dest[1];
		m3=(double)dest[2];
		m4=(double)dest[3];
		m5=(double)dest2[0];
		m6=(double)dest2[1];
		m7=(double)dest3[0];
		m8=(double)dest3[1];
		
		n1=m1;
		n2=m2;
		n3=m3;
		n4=m4;
		n5=m5;
		n6=m6;
		n7=m7;
		n8=m8;
		
		
	}
	public double[] calc()
	{
		
		double ar[] = new double [8];
		
		ar[0]=n1;
		ar[1]=n2;
		ar[2]=n3;
		ar[3]=n4;
		ar[4]=n5;
		ar[5]=n6;
		ar[6]=n7;
		ar[7]=n8;
	
		
		
		
	
		return ar;
		
	}
	double[] results=calc();
}
