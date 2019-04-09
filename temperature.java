package rocky;


public class temperature {
	
	readfile hey =new readfile();
	
	private int[] dest = ((hey.result).clone());
	private double hotHas;
	private double normalHas;
	private double coolHas;
	
	
	
	
	public temperature()
	{
		hotHas=(double)dest[0]/dest[7];
		normalHas=(double)dest[1]/dest[7];
		coolHas=(double)dest[2]/dest[7];
		
		System.out.println(hotHas);
		System.out.println(normalHas);
		System.out.println(coolHas);
		
		
	

	}

}
