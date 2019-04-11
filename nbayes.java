package rocky;

public class nbayes 
{
	//gathering data from all calc classes
	temperature data4 =new temperature();
	aches data5 =new aches();
	soreThroat data6 =new soreThroat();
	
	//cloning arrays
	private double[] calculatedTemp = ((data4.resultTemp).clone());
	private double[] calculatedAches = ((data5.resultAches).clone());
	private double[] calculatedSThroat = ((data6.resultSThroat).clone());
	
	private double m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16;
 
	private static double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16;
	
	public nbayes() 
	{
		//transfering all the data 
		m1=(double)calculatedTemp[0];
		m2=(double)calculatedTemp[1];
		m3=(double)calculatedTemp[2];
		m4=(double)calculatedTemp[3];
		m5=(double)calculatedTemp[4];
		m6=(double)calculatedTemp[5];
		m7=(double)calculatedTemp[6];
		m8=(double)calculatedTemp[7];
		
		m9=(double)calculatedAches[0];
		m10=(double)calculatedAches[1];
		m11=(double)calculatedAches[2];
		m12=(double)calculatedAches[3];
		
		m13=(double)calculatedSThroat[0];
		m14=(double)calculatedSThroat[1];
		m15=(double)calculatedSThroat[2];
		m16=(double)calculatedSThroat[3];
			
		//into static
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
		n13=m13;
		n14=m14;
		n15=m15;
		n16=m16;
				
	}
	public double[] LastSet()
	{
		//all data ready for gui use
		double FinalArray[] = new double [16];
		
		FinalArray[0]=n1;
		FinalArray[1]=n2;
		FinalArray[2]=n3;
		FinalArray[3]=n4;
		FinalArray[4]=n5;
		FinalArray[5]=n6;
		FinalArray[6]=n7;
		FinalArray[7]=n8;
		FinalArray[8]=n9;
		FinalArray[9]=n10;
		FinalArray[10]=n11;
		FinalArray[11]=n12;
		FinalArray[12]=n13;
		FinalArray[13]=n14;
		FinalArray[14]=n15;
		FinalArray[15]=n16;
	
		return FinalArray;
		
	}
	double[] naiveBaes=LastSet();
}
