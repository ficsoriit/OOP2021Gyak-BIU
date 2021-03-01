package szobeolvasas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ubuntu
 *
 */
public class SzoBeolvasas {
	static Scanner megnyitInput() {
		return new Scanner(System.in);
	}
	
	static String sortBeolvas(Scanner input) {
		return input.nextLine();
	}
	
	static String getKovetkezoSzo(Scanner input) {
		String szo = sortBeolvas(input);
		if (szo.charAt(0) == '*') {
			szo = "";
		}
		return szo;
	}
	
	static ArrayList<String> szavakatELtarol(Scanner input) {
		ArrayList<String> szavak = new ArrayList<>();
		String szo = getKovetkezoSzo(input);
		if (szo.equals("")) {
			return szavak;
		}
		szavak.add(szo);
		//!((szo = getKovetkezoSzo(input)).equals(""))
		while ( !((szo = getKovetkezoSzo(input)).equals("")) ) {
			boolean beszuras = false;;
			for (int i=0; i<szavak.size(); i++) {
				if (szavak.get(i).compareTo(szo)>=0) {
					szavak.add(i, szo);
					beszuras = true;
					break;
				}
			}
			if (!beszuras) {
				szavak.add(szo);				
			}
		}
		return szavak;		
	}
	
	static ArrayList<String> ismetlodoketEltarol(ArrayList<String> szavak) {
		ArrayList<String>  ismetelt = new ArrayList<String>();
		String szo;
		for (int i=0; i<szavak.size()-1; i++) {
			szo = szavak.get(i);
			for (int j=i+1; j<szavak.size(); j++) {
				if (szo.equals(szavak.get(j))) {
					// Jószef megoldása
					if (!ismetelt.contains(szo)) {
						ismetelt.add(szo);
					}
					/* Lajos megoldása
					ismetelt.add(szo);
					for (int k=j+1; k<szavak.size(); k++) {
						if (!szo.equals(szavak.get(k))) {
							break;
						}						
						i++;
					}
					*/					
					break;
				}
			}
		}
		return ismetelt;
	}
	
	
	
	static void kiirArrayList(ArrayList<String> szavak) {
		if (szavak.isEmpty()) {
			System.out.println("A tömb üres");
		} else {
			System.out.println("A tömb tartalma:");
			for (String szo : szavak) {
				System.out.print(szo + "\t");
			}
			System.out.println();			
		}
		/*
		 * for (String szo, int i=0; i<szavak.size; i++) {
		 * 		szo = szavak.get(i);
		 * 		.....
		 */
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = megnyitInput();
		ArrayList<String> szavak = szavakatELtarol(input);
		kiirArrayList(szavak);
		ArrayList<String> ismetlodo = ismetlodoketEltarol(szavak);
		kiirArrayList(ismetlodo);
	}

}