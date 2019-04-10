package rocky;

public class nbayes 
{
	temperature hey =new temperature();
	aches hey2 =new aches();
	soreThroat hey3 =new soreThroat();
	
	private double[] dest = ((hey.result).clone());
	private double[] dest2 = ((hey2.result).clone());
	private double[] dest3 = ((hey3.result).clone());
	
	private double m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
 
	private static double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12;
	public nbayes() 
	{
		m1=(double)dest[0]*dest2[0]*dest3[0]*dest[3];
		m2=(double)dest[0]*dest2[0]*dest3[1]*dest[3];
		m3=(double)dest[0]*dest2[1]*dest3[0]*dest[3];
		m4=(double)dest[0]*dest2[1]*dest3[1]*dest[3];
		m5=(double)dest[1]*dest2[0]*dest3[0]*dest[3];
		m6=(double)dest[1]*dest2[0]*dest3[1]*dest[3];
		m7=(double)dest[1]*dest2[1]*dest3[0]*dest[3];
		m8=(double)dest[1]*dest2[1]*dest3[1]*dest[3];
		m9=(double)dest[2]*dest2[0]*dest3[0]*dest[3];
		m10=(double)dest[2]*dest2[0]*dest3[1]*dest[3];
		m11=(double)dest[2]*dest2[1]*dest3[0]*dest[3];
		m12=(double)dest[2]*dest2[1]*dest3[1]*dest[3];
		
		n1=m1;
		n2=m2;
		n3=m3;
		n4=m4;
		n5=m5;
		n6=m6;
		n7=m7;
		n8=m8;
		n9=m9;
		n10=m10;
		n11=m11;
		n12=m12;
		
	}
	public double[] calc()
	{
		
		double ar[] = new double [13];
		
		ar[0]=n1;
		ar[1]=n2;
		ar[2]=n3;
		ar[3]=n4;
		ar[4]=n5;
		ar[5]=n6;
		ar[6]=n7;
		ar[7]=n8;
		ar[8]=n9;
		ar[9]=n10;
		ar[10]=n11;
		ar[11]=n12;
		
		System.out.println("start of thisssssssssssssssssssss");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(n8);
		System.out.println(n9);
		System.out.println(n10);
		System.out.println(n11);
		System.out.println(n12);
		
	
		return ar;
		
	}
	double[] results=calc();
}
