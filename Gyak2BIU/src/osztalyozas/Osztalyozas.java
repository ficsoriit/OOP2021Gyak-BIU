/**
 * Author: Ficsor Lajos
 */
package osztalyozas;

public class Osztalyozas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pontszamok = {12, 33, 40, 50, 23, 28, 30, 23, 45, 10};
		int[][] eredmenyek = new int[6][];
		eredmenyek = eredmenyTablaKeszites(pontszamok);
		kiirEredmenTabla(eredmenyek, pontszamok);

	}
	
	static int[][] eredmenyTablaKeszites(int[] pontszamok) {
		int[] letszam = new int[6];
		for (int i=0; i< letszam.length; i++) letszam[i] = 0;
		
		for (int elem : pontszamok) {
			letszam[jegySzamitas(elem)]++;
		}
			//Teszt
			//for (int e : letszam) {
			//	System.out.println(e);
			//}
			// Teszt
		int [][] tabla = new int[6][];
		for (int i=0; i< tabla.length; i++) {
			tabla[i] = new int[letszam[i]];
		}
		
		int[] index = {0, 0, 0, 0, 0, 0};
		int jegy;
		for (int i=0; i<pontszamok.length; i++) {
			jegy = jegySzamitas(pontszamok[i]); 
			tabla[jegy][index[jegy]] = i;
			index[jegy]++;
		}
		
		return tabla;
	}
	
	
	static int jegySzamitas(int pontszam) {
		if (pontszam <= 25) return 1;
		if (pontszam <= 31) return 2;
		if (pontszam <= 38) return 3;
		if (pontszam <= 44) return 4;
		return 5;
	}
		
	static void kiirEredmenTabla(int [][] eredmenyek, int[] pontszamok) {
		for (int i=1; i<eredmenyek.length; i++) {
			System.out.println("Jegy: " + i + " Vizsgak:");
			for (int j=0; j<eredmenyek[i].length; j++) {
				System.out.print(eredmenyek[i][j] + "(" +  pontszamok[eredmenyek[i][j]] + " pont)\t");
			}
			System.out.println();
		}
	}
}