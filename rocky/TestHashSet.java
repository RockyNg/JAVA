package rocky;




import java.util.*;
import java.util.Scanner;


public class TestHashSet {

	HashSet<String> countries = new HashSet<>(Arrays.asList("Albania", "Andorra", "Austria", "Belarus", "Belgium",
			"Bosnia Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Estonia", "Hungary",
			"Iceland", "Ireland","Italy", "Kosovo", "Latvia", "Liechtenstein",
		"Lithuania", "Luxemburg", "Macedonia", "Malta", "Moldova", "Monaco", "Montenegro", "Norway", "Poland",
		"Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain",
		"Sweden", "Switzerland", "the Netherlands", "the United Kingdom", "Turkey", "Ukraine"));
	
	public void print()
	{
		Iterator<String> i = countries.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
	
	public void addEntry(String country)
	{
		countries.add(country);
	}
	
	public boolean matchEntry(String country)
	{
		return countries.contains(country);
	}
	
	public void clearSet()
	{
		countries.clear();
	}
	
	public void sorting()
	{
		List<String> newList = new ArrayList<String>(countries);//newlist is my h
		Collections.sort(newList);
		//Collections.reverse(newList);
		//Collections.shuffle(newList);
		System.out.println(newList);
		Iterator<String> i = newList.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
}
//adfsbyuvssf]
/*package lab12;



public class Control {


	public static void main(String args[])
	{
		TestHashSet newbie = new TestHashSet();
		
		
		//newbie.clearSet();
		newbie.addEntry("Vatican City");
		boolean just= newbie.matchEntry("Russia");
		System.out.println(just);	
		
		newbie.print();
		newbie.sorting();
	}
}*/

