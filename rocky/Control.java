package rocky;


import java.util.Random;

import random_game.GuessingGame;

public class Control {

	
	public static void main(String[] args) {
		 
		Random rand = new Random();
		int freq[]=new int[7];
		
		for (int roll=0;roll<100;roll++) {
			++freq[1+rand.nextInt(6)];
			
		}
		
		System.out.println("Face\tFrequency");
		
		for(int face=1;face<freq.length;face++){
			System.out.println(face+"\t"+freq[face]);
		}
		
	}
}
