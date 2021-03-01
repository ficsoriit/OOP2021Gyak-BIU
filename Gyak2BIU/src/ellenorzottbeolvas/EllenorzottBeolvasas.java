/**
 * Author: Ficsor Lajos
 */
package ellenorzottbeolvas;

import java.util.Scanner;

public class EllenorzottBeolvasas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int szam = beolvasEgesz("Adj meg egy egész számot!");
		System.out.println("A beolvasott szám: " + szam);
		szam = beolvasEgeszIntervallumbol(10, 100);
		System.out.println("A beolvasott szám: " + szam);
		
	}
	
	static int beolvasEgesz(String promt) {
		int szam=0;
		Scanner sc = new Scanner(System.in);
		String sor;
		boolean ok;
		do {
			ok = true;
			System.out.println(promt);
			sor = sc.nextLine();
			try {
				szam = Integer.parseInt(sor);	
			} catch (NumberFormatException e) {
				System.out.println("Hibás adat!");
				ok = false;
			}
						
		} while (!ok);
		
		return szam;
	}

	static int beolvasEgeszIntervallumbol(int also, int felso) {
		int szam;
		do {
			szam = beolvasEgesz("Adj meg egy egész számot " + also +  " és " + felso + " között!");
		} while (szam < also || szam > felso);
		return szam;
	}
}