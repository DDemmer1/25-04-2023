package de.demmer.dennis;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		intArray[0] = 1;
		intArray[1] = 5;
		intArray[2] = 7;
		
//		System.out.println(intArray[1]);
//		System.out.println(intArray.length);

		
		
		//STRG + SHIFT + O
		List<Integer> liste1 = new ArrayList<Integer>();
		liste1.add(1);
		liste1.add(5);
		liste1.add(7);
		
		
//		System.out.println(liste1.get(1));
//		System.out.println(liste1.contains(5));
//		System.out.println(liste1.remove(2));
//		System.out.println(liste1.isEmpty());
//		System.out.println(liste1.size());
		
		
		
	    List<String> stringList = new ArrayList<>();
		
		stringList.add("Milch");
		stringList.get(5);
		
		stringList.remove("Milch");
		stringList.remove(0);
		
		
		
	}
	

}
