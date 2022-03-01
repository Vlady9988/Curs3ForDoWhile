package curs3;

import java.util.Scanner;

public class letterSearch {

	public static void main(String[] args) {
		
		System.out.println("Te rog introdu un text:");
		
		Scanner scan = new Scanner(System.in);  //sublinierea de la scan e din cauza la resourse leak si trebuie inchis, sau ar fi bine
		String text = scan.next();  //sublinierea de la text e din cauza ca nu a fost folosita variabila
		scan.close();
		
		//caut litera 'a' in textul "masina"
		//masina este un string, iar stringul in java este o secventa de caractere
		//012345
		
		boolean letterFound = false;
		int counter = 0;
		
		for (int i=0; i<text.length(); i++) {
			char currentLetter = text.charAt(i);
			
			if (currentLetter == 'A' || currentLetter == 'a') {
				System.out.println("Letter 'A' is present in text at index: " +i);
				letterFound=true;
				counter++;
				//break;
			}
		}
		if (letterFound) {
			
			System.out.println("Letter 'A' is present in text " + counter + " times");
			
		}
		else {
			System.out.println("Litera 'A' nu a fost gasita");
		}

	}

}
