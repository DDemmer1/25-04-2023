package de.demmer.dennis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	
	
	//main + STRG + LEERTASTE -> ENTER
	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		
		ArrayList<String> meineListe = new ArrayList<String>();
		
		liste.add(5);
		liste.add(9);
		liste.add(1);

		for(int i = 0;i < liste.size();i++) {
			
//			int currentInt = liste.get(i);
//			System.out.println(currentInt);

//			System.out.println(liste.get(i));
		}
		
		
		liste.remove(0);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {

			String input = sc.next();
			System.out.println(input);
			
			if(input.equals("j")) {
				System.out.println("Eingabe ist j");
				break;
			}
	
		}
		
		
		
		

		
	}
	
	
	
	
	
	
	
	
	
	
	

}
