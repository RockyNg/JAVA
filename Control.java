package rocky;

import java.util.Scanner;

import javax.swing.JFrame;

public class Control {

	
	
	public static void main(String[] args) {
		
		readfile data = new readfile();
		
		data.openfile();
		
		data.readFile();
		data.closeFile();
	

	
		//gui go = new gui();
		temperature bruh =new temperature();
		aches bruh2 =new aches();
		soreThroat bruh3 =new soreThroat();
		
		nbayes bruh23 =new nbayes();
		test bruh33 =new test();
		bruh.calc();
		
		

		
		
		 
		
		
	}
}
