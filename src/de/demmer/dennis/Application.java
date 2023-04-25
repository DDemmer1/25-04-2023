package de.demmer.dennis;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	
	//main + STRG + LEERTASTE -> ENTER
	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList<Integer>();
		
		liste.add(5);
		liste.add(9);
		liste.add(1);


		
		for(int i = 0;i < liste.size();i++) {
			
//			int currentInt = liste.get(i);
//			System.out.println(currentInt);
			
			System.out.println(liste.get(i));
			
		}
		
		
		liste.remove(0);

		
	}
	
	
	
	
	
	
	
	
	
	
	

}
