package szobeolvasasref1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ubuntu
 *
 */
public class SzoBeolvasasRefactored1 {
	
	final private Scanner input;
	final private char terminator;
	
	public SzoBeolvasasRefactored1(char terminator) {
		super();
		this.terminator = terminator;
		input = megnyitInput();
	}
		
	public SzoBeolvasasRefactored1() {
		this('*');
	}

	private Scanner megnyitInput() {
		Scanner input = new Scanner(System.in);
		return input;
	}

	
	private String sortBeolvas() {
		return input.nextLine();
	}
	
	private String getKovetkezoSzo() throws Exception {
		String szo = sortBeolvas();
		if (szo.equals("")) return szo;
		if (szo.charAt(0) == terminator) {
			throw new Exception("Termináló karakter");
		}
		return szo;
	}
	
	public ArrayList<String> szavakatELtarol() {
		ArrayList<String> szavak = new ArrayList<>();
		String szo;
		//!((szo = getKovetkezoSzo(input)).equals(""))
		while ( true ) {
			try {
				szo = getKovetkezoSzo();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e.getMessage());
				break;
			}
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
	
	public ArrayList<String> ismetlodoketEltarol(ArrayList<String> szavak) {
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
	
	
	
	public void kiirArrayList(ArrayList<String> szavak) {
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

}