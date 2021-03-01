/**
 * Author: Ficsor Lajos
 */
package szoszamlalas;

import java.util.Scanner;

public class Szavak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int szavakSzama;
		
		String sor;
		Scanner input = new Scanner(System.in);
		sor = input.nextLine();
		szavakSzama = szamlal(sor);
		
		System.out.println("Szavak száma: " + szavakSzama);

	}
	
	static int szamlal(String sor) {
		int szavakSzama = 1;
		if (sor.length() == 0) return 0;
		for (int i=0; i<sor.length(); i++) {
			if (sor.charAt(i) == ',') szavakSzama++;
		}
		return szavakSzama;		
	}

}