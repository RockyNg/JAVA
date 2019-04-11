/*
 * Author:Rocky Ng
 * Date: 11-04-19
 * Description: A machine learning prediction program for Tongsillitis*/
package rocky;

public class Control {

	
	
	public static void main(String[] args) 
	{
		
		//read from the data set given and store the training portion
		readfile data = new readfile();
		data.openfile();
		data.readFile();
		data.closeFile();
	
		//run the calculations for the possibility of having each symptom
		temperature calcTemp =new temperature();
		aches calcAches =new aches();
		soreThroat calcSoreThroat =new soreThroat();
		
		//collect all the calculations from each class into 1 class
		nbayes gatherCalc =new nbayes();
		
		//gui time
		gui runThisThing = new gui();
		
	}
}
