package de.demmer.dennis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	
	
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> einkaufsliste = new ArrayList<String>();

		System.out.println("Willkommen bei ihrer Einkaufsliste!");
	
		while(true) {

			System.out.println("Brauchen wir noch was? j/n");
			String input = scanner.next();
			
			if(input.equals("j")) {
				System.out.println("Was brauchen wir? Bitte eingeben");
				String einkauf = scanner.next();
				einkaufsliste.add(einkauf);
			}else if(input.equals("n")) {
				System.out.println("Einkaufsliste:");
				
				for(String current : einkaufsliste) {
					System.out.println(current);				
				}
				break;
			} else {
				System.out.println(input + " ist keine gültige Eingabe");

			}
			
			
			
			
			
		}
		
		
		

		
	}
	
	
	
	
	
	
	
	
	
	
	

}
